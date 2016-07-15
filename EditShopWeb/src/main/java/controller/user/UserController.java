package controller.user;

import java.text.ParseException;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import shop.cls.user.UserAdminService;
import shop.encryption.Crypter;
import vo.CertificationVO;
import vo.User;
import vo.UserDetail;

@Controller
public class UserController {
	
	@Autowired
	private UserAdminService service;
	@Autowired
	private Crypter crypter;
	
	/**
	 * 로그인
	 * @param user
	 * @param session
	 * @return Status에 맞는 화면 userDetail.VO
	 */
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public String login(User user, HttpSession session){
				
		String pwd = null;
		//암호화
		try{
			pwd = crypter.encrypt(user.getPassword().trim());

		}catch(Exception e){
			e.printStackTrace();
		}
		
		// user받아오기
		Map<String, Object> inUser = service.login(user.getId(), pwd);
		if(inUser == null){
			//없는유저
		}

		
		int status = (Integer)inUser.get("status");
		//정상이 아실시
		if(status != 11){
			if(status == 10){
				try{
					service.reSendMail(user.getId());	
				}catch(ParseException e){
					e.printStackTrace();
				}
				
				return "redirect:/views/checkemail.jsp";
			}
			//제재시
			else if(status == 12){
				//error페이지로
				return "redirect:/views/login.jsp";
			}
			else if(status == 20){
				//판매자
				
				return "redirect:/seller.do";
			}
		}else{
			session.setAttribute("user", user);
			return "redirect:/main.do";
		}
		
		return "main";
	}
	
	/**
	 * 가입
	 * @param user
	 * @param email
	 * @return 가입대기 화면
	 */
	@RequestMapping(value="join.do", method=RequestMethod.POST)
	public String signUp(User user,@RequestParam String email){

		String pwd = user.getPassword();
		//비밀번호 암호화!
		try{
			pwd = crypter.encrypt(pwd);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//암호화 성공시!
		try{
			if(pwd != null){
				service.addUser(user.getId(), pwd,email);				
			}
			
		}catch(ParseException e){
			e.printStackTrace();
		}
		
		return "checkemail";
	}
	
	/**
	 * 가입때 userID확인
	 * id확인 method
	 * @param id
	 * @return
	 */
	@RequestMapping(value="existuserid.do")
	@ResponseBody
	public boolean existId(@RequestParam String id){
		return service.existUser(id);
	}
	
	/**
	 * 로그아웃
	 * @param session
	 * @return 
	 */
	@RequestMapping(value="logout.do")
	public String logoutUser(HttpSession session){
		User user = (User)session.getAttribute("user");
		
		if(!service.logOut(user.getId())){
			System.out.println("로그아웃이 되지 않았습니다.");
		}
		session.invalidate();
		
		return "redirect:/main.do";
	}
	
	/**
	 * 메일 인증 확인
	 * @param id 
	 * @param key
	 * @param session
	 * @return views // session userDetail
	 */
	@RequestMapping(value="certification.do")
	public String certificationUser(@RequestParam String id, @RequestParam String key, @RequestParam String email, HttpSession session){
		System.out.println(id);
		System.out.println(key);
		
		
		
		// ID확인
		if(service.existUser(id)){
			//Exception
			System.out.println("없음!");	
			return "redirect:main.do";
		}
		
		CertificationVO vo = new CertificationVO();
		vo.setId(id);
		vo.setKey(key);
		//인증키 비교
		if(!service.compareKeyTime(vo)){
			//이메일 재 전송
			//메일 재발송 method
			try{
				service.reSendMail(id);
				
			}catch(ParseException e){
				e.printStackTrace();
			}
			return "checkemail";
		}
		session.setAttribute("userid", id);
		session.setAttribute("email", email);
		
		return "certification";
	}
	
	@RequestMapping(value="aftercertification.do", method=RequestMethod.POST)
	public String afterCertificatoin(UserDetail userDetail, HttpSession session){
		String userId = (String)session.getAttribute("userid");
		String userEmail = (String)session.getAttribute("email");

		userDetail.setId(userId);
		userDetail.setEmail(userEmail);
		User user = new User();
		user.setUserDetail(userDetail);
		
		service.addDetailUser(user);
		session.setAttribute("user", userDetail);
		
		return "redirect:/main.do";
	}
}
