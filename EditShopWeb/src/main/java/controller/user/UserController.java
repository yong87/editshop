package controller.user;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import vo.User;

@Controller
public class UserController {
	
	/*@Autowired
	private UserAdminService service;*/
	
	/**
	 * 로그인
	 * @param user
	 * @param session
	 * @return Status에 맞는 화면
	 */
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public String login(User user, HttpSession session, HttpServletResponse response){
	
		//Status확인
		//leng확인
		//session저장
		//redirect product-main
		session.setAttribute("user", user);
		
		try{
			response.sendRedirect("/EditShopWeb/main.do");			
		}catch(Exception e){
			e.printStackTrace();
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
		System.out.println("called");
		System.out.println(user.getId());
		System.out.println(user.getPassword());
		System.out.println(email);
		
		//service.addUser(user);
		
		return "afterjoin";
	}
	
	/**
	 * id확인 method
	 * @param id
	 * @return
	 */
	@RequestMapping(value="existuserid.do")
	@ResponseBody
	public boolean existId(@RequestParam String id){
		System.out.println("id : "+id);
		
		return true;
	}
	
	/**
	 * 로그아웃
	 * @param session
	 * @return 
	 */
	@RequestMapping(value="logout.do")
	public void logoutUser(HttpSession session, HttpServletResponse response){
		
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
}
