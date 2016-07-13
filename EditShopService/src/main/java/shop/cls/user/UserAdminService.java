package shop.cls.user;

import java.text.ParseException;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.centification.Centification;
import shop.emailing.EmailService;
import shop.intfc.user.entity.UserAddEntityInter;
import shop.intfc.user.entity.UserAdminEntityInter;
import shop.intfc.user.service.UserAdminServiceInter;
import vo.User;

import com.sun.jmx.snmp.Timestamp;

@Service
public class UserAdminService implements UserAdminServiceInter {

	@Autowired
	UserAdminEntityInter userAd;
	@Autowired
	UserAddEntityInter userAdd;

	// 0530/1434 complete test
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
	public boolean logOut(String id) {
		return userAd.addExitTime(id);
	}

	// 0530/1450 complete test
	public boolean exitUser(String id, String password) {
		if (!password.equals(userAd.getPasswordById(id))) {
			return false;
		}
		return userAd.changeAuthority(id, 0);
	}

	public boolean addUser(String id, String password, String email)
			throws ParseException {
		
		//DB기본정보 입력
		if (!userAdd.addDefalutUser(id, password)) {
			return false;
		}
		//인증번호 생성
		String centificationKey = new Centification()
				.GenerateCentificationKey(id);
		
		if (centificationKey == null) {
			return false;
		}
		
		//메일 발송
		EmailService emailService = new EmailService();

		emailService.emailSend(email, geratedMailContent(centificationKey, id));

		//certification tb저장;
		
		return true;
	}

	private String geratedMailContent(String centificationKey, String id)
			throws ParseException {
		//TODO content HTML 수정해주세요
		// Date input = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초")
		// .parse(new Timestamp(new Date().getTime()).toString());

		Timestamp input = new Timestamp(new Date().getTime());

		return "<html><body><table border='0' cellspacing='0' cellpadding='0' style='max-width:600px'><tbody><tr><td><table width='100%' border='0' cellspacing='0' cellpadding='0'><tbody><tr><td align='left'></td><td align='right'></td></tr></tbody></table></td></tr><tr height='16'></tr><tr><td><table bgcolor='#4374D9' width='100%' border='0' cellspacing='0' cellpadding='0' style='min-width:332px;max-width:600px;border:1px solid #e0e0e0;border-bottom:0;border-top-left-radius:3px;border-top-right-radius:3px'><tbody><tr><td height='72px' colspan='3'></td></tr><tr><td width='32px'></td><td style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:24px;color:#ffffff;line-height:1.25'>회원가입 인증 메일입니다.</td><td width='32px'></td></tr><tr><td height='18px' colspan='3'></td></tr></tbody></table></td></tr><tr><td><table bgcolor='#FAFAFA' width='100%' border='0' cellspacing='0' cellpadding='0' style='min-width:332px;max-width:600px;border:1px solid #f0f0f0;border-bottom:1px solid #c0c0c0;border-top:0;border-bottom-left-radius:3px;border-bottom-right-radius:3px'><tbody><tr height='16px'><td width='32px' rowspan='3'></td><td></td><td width='32px' rowspan='3'></td></tr><tr><td><table style='min-width:300px' border='0' cellspacing='0' cellpadding='0'><tbody><tr><td style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5'><br>"
				+ id
				+ "님, 안녕하세요.</td></tr><tr><td style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5'>"
				+ "이 메일은 <a href='http://localhost:8080/EditShopWeb/main.do' style='text-decoration:none;color:#4285f4' target='_blank'>우리가 만든 쇼핑몰</a>에 등록하며 발송되는 메일입니다.<table border='0' cellspacing='0' cellpadding='0' style='margin-top:16px;margin-bottom:16px'><tbody><tr valign='middle'><td width='16px'></td><td style='line-height:1.2'><span style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:16px;color:#202020'>세부정보:</span><br><span style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#727272’>"
				+ input.toString()
				+ "<br>-위치-</span></td></tr></tbody></table>"
				+ "<a href='####' style='text-decoration:none;color:#4285f4' target='_blank' data-saferedirecturl='https://www.google.com/url?hl=ko&amp;q=https://support.google.com/accounts/answer/6010255&amp;source=gmail&amp;ust=1464846646501000&amp;usg=AFQjCNFNJSyXvhHDCWoOVRZoTJUm4YhoQQ'>우리가 만든 쇼핑몰</a>의 가입절차를 완료하기위해 아래에 위치하는 링크를 연결해 사이트로 로그인하시면 회원가입 절차를 계속해서 진행 할 수 있습니다.<table style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:10px;color:#666666;line-height:18px;padding-bottom:10px'><br><tbody><tr><td>만일 링크가 만료되었다면 홈페이지>로그인>인증메일 다시 받기 메뉴를 통해 다시 시도하실 수 있습니다.<br>링크가 클릭이 되지 않는 경우에는 링크 우클릭>링크복사>URL창에 직접 입력 부탁드립니다.</td></tr><tr><td><div style='direction:ltr;text-align:left'></div></td></tr></tbody></table>"
				+ "<a href='http://localhost:8080/EditShopWeb/certification.do?id="+id+"&key="+centificationKey+"' style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;display:inline-block;text-align:center;text-decoration:none;min-height:36px;line-height:36px;padding-left:8px;padding-right:8px;min-width:88px;font-size:14px;font-weight:400;color:#ffffff;background-color:#4184f3;border-radius:2px;border-width:0px' target='_blank'>지금 계속하기</a></td></tr><tr height='32px'></tr><tr><td colspan='2' style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5'>감사합니다.<br>우리가만든쇼핑몰</td></tr><tr height='16px'></tr><tr><td colspan='2'><table style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:12px;color:#b9b9b9;line-height:1.5'><tbody><tr><td >*이 위치는 로그인한 IP 주소를 근거로 한 대략적인 위치입니다.<br></td></tr><tr><td colspan='2'>본 이메일은 발신 전용입니다. 자세히 알아보려면 <a href='####' style='text-decoration:none;color:#4285f4' target='_blank' data-saferedirecturl='https://www.google.com/url?hl=ko&amp;q=https://support.google.com/accounts/answer/6010255&amp;source=gmail&amp;ust=1464846646501000&amp;usg=AFQjCNFNJSyXvhHDCWoOVRZoTJUm4YhoQQ'>우리가 만든 쇼핑몰</a>를 방문하세요.</td></tr></tbody></table></td></tr></tbody></table></td></tr><tr height='32px'></tr></tbody></table></td></tr><tr height='16'></tr><tr><td style='max-width:600px;font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:10px;color:#bcbcbc;line-height:1.5'></td></tr><tr><td></td></tr></tbody></table></body></html>";
	}

	public boolean addDetailUser(User user) {
		return userAdd.addDetailUser(user.getUserDetail());
	}
	
	public boolean existUser(String id){
		return userAdd.overlap(id);
	}
}
