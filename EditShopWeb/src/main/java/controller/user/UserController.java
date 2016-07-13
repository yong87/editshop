package controller.user;

import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import shop.cls.user.UserAdminService;
import shop.encryption.Crypter;
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
	public String login(User user, HttpSession session, HttpServletResponse response){
		//pw암화화 
		//date 받아오기
		//null check
		//status check
		//session 저장
		//redirect!
		
		String pwd = null;
		try{
			pwd = crypter.encrypt(user.getPassword().trim());

		}catch(Exception e){
			e.printStackTrace();
		}
		
		Map<String, Object> inUser = service.login(user.getId(), pwd);
		if(inUser == null){
			//없는유저
		}

		int status = (Integer)inUser.get("status");
		//정상이 아실시
		if(status != 11){
			if(status == 10){
				//mail send
				/*try{
					response.sendRedirect("/EditShopWeb/views/checkmail.jsp");
				}catch(Exception e){
					e.printStackTrace();
				}*/
				return "redirect:/EditShopWeb/views/checkmail.jsp";
			}
			//제재시
			else if(status == 12){
				try{
					//ErrorPage로
					response.sendRedirect("/EditShopWeb/views/login.jsp");				
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(status == 20){
				//판매자
				try{
					response.sendRedirect("/EditShopWeb/seller.do");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}else{
			session.setAttribute("user", user);
			return "redirect:/EditShopWeb/main.do";
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
	public void logoutUser(HttpSession session, HttpServletResponse response){
		User user = (User)session.getAttribute("user");
		
		if(!service.logOut(user.getId())){
			System.out.println("로그아웃이 되지 않았습니다.");
		}
		session.invalidate();
		try{
			response.sendRedirect("/EditShopWeb/main.do");			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * findId
	 * 서비스 불러서 서비스에서 email전송? 아니면 Id몇글자만 보여줌?
	 * @param email
	 * @param name
	 * @return String
	 */
	@RequestMapping(value="findId.do", method=RequestMethod.POST)
	public String findUserId(@RequestParam String email, @RequestParam String name){
		
		System.out.println(email);
		System.out.println(name);
		
		return "afterjoin";
	}
	
	
	/**
	 * findpwd
	 * 서비스불러서 서비스에서 email전송
	 * @param userId
	 * @param email
	 * @return String
	 */
	@RequestMapping(value="findPwd.do", method=RequestMethod.POST)
	public String findUserPwd(@RequestParam String userId, @RequestParam String email){
		
		System.out.println(userId);
		System.out.println(email);
		
		return "afterjoin";
	}
	
	/**
	 * 유저 상세정보 
	 * service에서 method불러오기
	 * @param session
	 * @return mnv
	 */
	@RequestMapping(value="userDetail.do")
	public ModelAndView userDetail(HttpSession session){
		
		User user = (User)session.getAttribute("user");
		System.out.println(user.getId());
		
		ModelAndView mnv = new ModelAndView();
		mnv.setViewName("userDetail");
			
		return mnv;
	}
	
	/**
	 * 비밀번호 변경
	 * @param response
	 * @param session
	 * @param pwd
	 */
	@RequestMapping(value="changePwd.do")
	public void changeUserPwd(HttpServletResponse response, HttpSession session, @RequestParam String pwd){
		
		User user = (User)session.getAttribute("user");
		System.out.println(user.getId());
		
		//main화면으로 이동
		try{
			response.sendRedirect("/EditShopWeb/main.do");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * 메일 인증 확인
	 * @param id 
	 * @param key
	 * @param session
	 * @return views // session userDetail
	 */
	@RequestMapping(value="certification.do")
	public ModelAndView certificationUser(@RequestParam String id, @RequestParam String key){
		System.out.println(id);
		System.out.println(key);
		
		ModelAndView mnv = new ModelAndView();
		
		/*boolean isExist = service.existUser(id);
		if(!isExist){
			// Error 페이지
			return null;
		}*/
		//확인
		mnv.setViewName("certification");
		
		return mnv;
	}
	
	@RequestMapping(value="aftercertification.do", method=RequestMethod.POST)
	public String afterCertificatoin(UserDetail userDetail, HttpSession session){
		System.out.println(userDetail.getNickname());
		System.out.println(userDetail.getName());
		System.out.println(userDetail.getAddress());
		System.out.println(userDetail.getPhone());
		System.out.println(userDetail.getLanguage());
		
		User user = new User();
		user.setUserDetail(userDetail);
		
		//service.addDetailUser(user);
		
		
		return "redirect:/main.do";
	}
}
