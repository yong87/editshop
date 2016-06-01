package usercontroller;

import intfc.user.UserAdminService;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import vo.User;

@Controller
public class UserController {
	
	@Autowired
	private UserAdminService service;
	
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public String login(User user, HttpSession session){
		
		
		return "main";
	}
	
	@RequestMapping(value="join.do", method=RequestMethod.POST)
	public String signUp(User user){
		
		service.addUser(user);
		
		return "sendEmail";
	}
	
	@RequestMapping(value="existuserid.do")
	@ResponseBody
	public boolean existId(String id){
		
		return false;
	}
	
	@RequestMapping(value="existuseremail.do")
	@ResponseBody
	public boolean existEmail(String email){
		
		return false;
	}
	
	
}
