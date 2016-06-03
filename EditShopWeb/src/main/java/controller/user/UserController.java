package controller.user;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	
	
}
