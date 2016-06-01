package usercontroller;

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
	
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public String login(User user, HttpSession session){
		
		
		return "main";
	}
	
	@RequestMapping(value="join.do", method=RequestMethod.POST)
	public String signUp(User user,@RequestParam String email){
		System.out.println("called");
		System.out.println(user.getId());
		System.out.println(user.getPassword());
		System.out.println(email);
		
		//service.addUser(user);
		
		return "sendEmail";
	}
	
	@RequestMapping(value="existuserid.do")
	@ResponseBody
	public boolean existId(@RequestParam String id){
		System.out.println("id : "+id);
		
		
		return false;
	}
	
	@RequestMapping(value="existuseremail.do")
	@ResponseBody
	public boolean existEmail(String email){
		
		return true;
	}
	
	
}
