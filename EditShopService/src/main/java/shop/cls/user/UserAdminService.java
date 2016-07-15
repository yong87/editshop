package shop.cls.user;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.centification.Centification;
import shop.emailing.EmailFormService;
import shop.emailing.EmailService;
import shop.intfc.certification.entity.CertificationEntityInter;
import shop.intfc.user.entity.UserAddEntityInter;
import shop.intfc.user.entity.UserAdminEntityInter;
import shop.intfc.user.service.UserAdminServiceInter;
import vo.CertificationVO;
import vo.User;
import vo.UserDetail;
import vo.UserInfo;

@Service
public class UserAdminService implements UserAdminServiceInter {

	@Autowired
	UserAdminEntityInter userAd;
	@Autowired
	UserAddEntityInter userAdd;
	@Autowired
	CertificationEntityInter certification;

	// 0530/1434 complete test
	/**
	 * login
	 */
	public Map<String, Object> login(String id, String password) {

		Map<String, Object> map = userAd.getPasswordById(id);

		String encrypted = map.get("password").toString();
		
		//암호화 비교
		if (!encrypted.equals(password.trim())) {
			return null;
		}
		
		userAd.checkLastVisitTime(id);
		userAd.addVisitCount(id);

		return map;
	}

	// 0530/1437 complete test
	/**
	 * logout
	 */
	public boolean logOut(String id) {
		return userAd.addExitTime(id);
	}

	// 0530/1450 complete test
	/**
	 * 유저탈퇴
	 */
	public boolean exitUser(String id, String password) {
		if (!password.equals(userAd.getPasswordById(id))) {
			return false;
		}
		return userAd.changeAuthority(id, 0);
	}

	/**
	 * 회원가입
	 */
	public boolean addUser(String id, String password, String email)
			throws ParseException {
		
		//DB기본정보 입력
		if (!userAdd.addDefalutUser(id, password)) {
			return false;
		}
		UserDetail userDetail = new UserDetail();
		userDetail.setEmail(email);
		userDetail.setId(id);
		if(!userAdd.addDetailUser(userDetail)){
			return false;
		}
		//인증번호 생성
		String centificationKey = new Centification()
				.GenerateCentificationKey();
		
		//반복하는 메소드 만들기 // 시간남으면
		//DB에 있는지 확인 및 있으면  재생성 무한 반복
		if(existKey(centificationKey)){
			for( ; ; ){
				//있으면 새로 생성
				centificationKey = new Centification()
				.GenerateCentificationKey();
				
				if(!existKey(centificationKey)){
					break;
				}
			}			
		}
		
		//메일 발송
		EmailService emailService = new EmailService();

		emailService.emailSend(email, geratedMailContent(centificationKey, id, email));

		//certification tb저장;
		//저장하는 메소드 따로 만들기
		//없으면 certification_tb에 저장 //만료시간추가
		CertificationVO ceri = new CertificationVO();
		ceri.setId(id);
		ceri.setKey(centificationKey);
		ceri.setLimitKeyTime(limitKeyTime());
		
		certification.addCertification(ceri);
		
		return true;
	}
	
	//메일 재 전송(certification)
	public boolean reSendMail(String id) throws ParseException{
		
		UserDetail user = userAd.getUserDetailById(id);
		
		String centificationKey = new Centification().GenerateCentificationKey();
		CertificationVO vo = new CertificationVO();
		
		vo.setId(id);
		vo.setKey(centificationKey);
		vo.setLimitKeyTime(limitKeyTime());
		
		//새로 추가 ?Modify? New?
		if(!certification.addCertification(vo)){
			return false;
		}
		
		// 메일 전송
		EmailService mailService = new EmailService();
		mailService.emailSend(user.getEmail(), geratedMailContent(centificationKey, id, user.getEmail()));
		
		return false;
	}

	//메일 FORM
	private String geratedMailContent(String centificationKey, String id,String email)
			throws ParseException {
		//TODO content HTML 수정해주세요
		// Date input = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초")
		// .parse(new Timestamp(new Date().getTime()).toString());

		Timestamp input = new Timestamp(new Date().getTime());

		return "<html><body><table border='0' cellspacing='0' cellpadding='0' style='max-width:600px'><tbody><tr><td><table width='100%' border='0' cellspacing='0' cellpadding='0'><tbody><tr><td align='left'></td><td align='right'></td></tr></tbody></table></td></tr><tr height='16'></tr><tr><td><table bgcolor='#4374D9' width='100%' border='0' cellspacing='0' cellpadding='0' style='min-width:332px;max-width:600px;border:1px solid #e0e0e0;border-bottom:0;border-top-left-radius:3px;border-top-right-radius:3px'><tbody><tr><td height='72px' colspan='3'></td></tr><tr><td width='32px'></td><td style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:24px;color:#ffffff;line-height:1.25'>회원가입 인증 메일입니다.</td><td width='32px'></td></tr><tr><td height='18px' colspan='3'></td></tr></tbody></table></td></tr><tr><td><table bgcolor='#FAFAFA' width='100%' border='0' cellspacing='0' cellpadding='0' style='min-width:332px;max-width:600px;border:1px solid #f0f0f0;border-bottom:1px solid #c0c0c0;border-top:0;border-bottom-left-radius:3px;border-bottom-right-radius:3px'><tbody><tr height='16px'><td width='32px' rowspan='3'></td><td></td><td width='32px' rowspan='3'></td></tr><tr><td><table style='min-width:300px' border='0' cellspacing='0' cellpadding='0'><tbody><tr><td style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5'><br>"
				+ id
				+ "님, 안녕하세요.</td></tr><tr><td style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5'>"
				+ "이 메일은 <a href='http://localhost:8080/EditShopWeb/main.do' style='text-decoration:none;color:#4285f4' target='_blank'>8ROUND</a>에 등록하며 발송되는 메일입니다.<table border='0' cellspacing='0' cellpadding='0' style='margin-top:16px;margin-bottom:16px'><tbody><tr valign='middle'><td width='16px'></td><td style='line-height:1.2'><span style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:16px;color:#202020'>세부정보:</span><br><span style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#727272’>"
				+ input.toString()
				+ "<br>-위치-</span></td></tr></tbody></table>"
				+ "<a href='####' style='text-decoration:none;color:#4285f4' target='_blank' data-saferedirecturl='https://www.google.com/url?hl=ko&amp;q=https://support.google.com/accounts/answer/6010255&amp;source=gmail&amp;ust=1464846646501000&amp;usg=AFQjCNFNJSyXvhHDCWoOVRZoTJUm4YhoQQ'>8ROUND</a>의 가입절차를 완료하기위해 아래에 위치하는 링크를 연결해 사이트로 로그인하시면 회원가입 절차를 계속해서 진행 할 수 있습니다.<table style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:10px;color:#666666;line-height:18px;padding-bottom:10px'><br><tbody><tr><td>만일 링크가 만료되었다면 홈페이지>로그인>인증메일 다시 받기 메뉴를 통해 다시 시도하실 수 있습니다.<br>링크가 클릭이 되지 않는 경우에는 링크 우클릭>링크복사>URL창에 직접 입력 부탁드립니다.</td></tr><tr><td><div style='direction:ltr;text-align:left'></div></td></tr></tbody></table>"
				+ "<a href='http://localhost:8080/EditShopWeb/certification.do?id="+id+"&key="+centificationKey+"&email="+email+"' style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;display:inline-block;text-align:center;text-decoration:none;min-height:36px;line-height:36px;padding-left:8px;padding-right:8px;min-width:88px;font-size:14px;font-weight:400;color:#ffffff;background-color:#4184f3;border-radius:2px;border-width:0px' target='_blank'>지금 계속하기</a></td></tr><tr height='32px'></tr><tr><td colspan='2' style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5'>감사합니다.<br>우리가만든쇼핑몰</td></tr><tr height='16px'></tr><tr><td colspan='2'><table style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:12px;color:#b9b9b9;line-height:1.5'><tbody><tr><td >*이 위치는 로그인한 IP 주소를 근거로 한 대략적인 위치입니다.<br></td></tr><tr><td colspan='2'>본 이메일은 발신 전용입니다. 자세히 알아보려면 <a href='####' style='text-decoration:none;color:#4285f4' target='_blank' data-saferedirecturl='https://www.google.com/url?hl=ko&amp;q=https://support.google.com/accounts/answer/6010255&amp;source=gmail&amp;ust=1464846646501000&amp;usg=AFQjCNFNJSyXvhHDCWoOVRZoTJUm4YhoQQ'>우리가 만든 쇼핑몰</a>를 방문하세요.</td></tr></tbody></table></td></tr></tbody></table></td></tr><tr height='32px'></tr></tbody></table></td></tr><tr height='16'></tr><tr><td style='max-width:600px;font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:10px;color:#bcbcbc;line-height:1.5'></td></tr><tr><td></td></tr></tbody></table></body></html>";
	}

	//유저 상새 정보 추가
	public boolean addDetailUser(User user) {
		UserDetail userDetail = user.getUserDetail();
		if(!userAd.changeAuthority(userDetail.getId(), 11)){
			return false;
		}
		
		return userAdd.addDetailUser(userDetail);
	}
	
	//유저 확인
	public boolean existUser(String id){
		return userAdd.overlap(id);
	}	
	
	//인증키 시간 비교
	public boolean compareKeyTime(CertificationVO vo){
		
		CertificationVO init = certification.getCertificationByUserId(vo);
		
		//현재시간 가져오기
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formet = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String calTime = formet.format(cal.getTime()).toString();
		Timestamp nowTime = Timestamp.valueOf(calTime);
		
		//비교후 리턴
		return nowTime.before(init.getLimitKeyTime());
	}
	
	//인증키 중복확인용
	private boolean existKey(String key){
		return certification.existKey(key);
	}
	
	//인증키 만료시간 생성
	private Timestamp limitKeyTime(){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, 15);
		
		SimpleDateFormat formet = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String calTime = formet.format(cal.getTime()).toString();
		Timestamp time = Timestamp.valueOf(calTime);
		
		return time;
	}

	@Override
	public boolean findUser(Map<String, Object> find) {
		// TODO Auto-generated method stub
		
		String type = (String) find.get("findType");
		String email = (String) find.get("email");
		//ID찾기
		EmailFormService form = new EmailFormService();
		EmailService mailing = new EmailService();
		if(type.equals("id")){
			// userId찾기  // 상용화전 List 말고  UserDetail로 변경
			List<UserDetail> users = userAd.getUserDetailByEmail(email);
			//UserDetail user = userAd.getUserDetailByEmail(email);
			
			//메일전송
			mailing.emailSend(email, form.findIdForm(users.get(0)));
			
			return true;
		}
		
		//PW찾기
		if(type.equals("pw")){
			//메일전송
			List<UserDetail> users = userAd.getUserDetailByEmail(email);
			//UserDetail user = userAd.getUserDetailByEmail(email);
			mailing.emailSend(email, form.findPwdForm(users.get(0)));
			
			return true;
		}
		
		return false;
	}

	@Override
	public User getUserInfo(String userId) {
		// TODO Auto-generated method stub
		User user = new User();
		UserDetail detail = userAd.getUserDetailById(userId);
		UserInfo info = userAd.getUserInfoById(userId);
		
		user.setUserDetail(detail);
		user.setUserInfo(info);
		
		return user;
	}

	
	
	
}
