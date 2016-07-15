package controller.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import shop.intfc.user.service.UserAdminServiceInter;
import vo.User;

@Controller
public class UserInfoController {

	@Autowired
	private UserAdminServiceInter service;
	
	/**
	 * findId
	 * 서비스 불러서 서비스에서 email전송? 아니면 Id몇글자만 보여줌?
	 * @param email
	 * @param name
	 * @return String
	 */
	@RequestMapping(value="findId.do", method=RequestMethod.POST)
	public String findUserId(@RequestParam String email){
		
		Map<String, Object> findId = new HashMap<String, Object>();
		findId.put("email", email);
		findId.put("findType", "id");
		
		boolean isSend = service.findUser(findId);
		if(!isSend){
			// error page로
			return "afterjoin";
		}
		
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
		Map<String, Object> find = new HashMap<String, Object>();
		
		find.put("userId", userId);
		find.put("email", email);
		find.put("findType", "pw");
		
		boolean isSend = service.findUser(find);
		if(!isSend){
			// error page
			return "afterjoin";
		}
		
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
	public String changeUserPwd(HttpSession session, @RequestParam String pwd){
		
		User user = (User)session.getAttribute("user");
		System.out.println(user.getId());
		
		//main화면으로 이동
		return "redirect:/main.do";
	}
	
	@RequestMapping(value="privateInfomation.do")
	public ModelAndView privateInfo(HttpSession session){
		User sessionUser = (User) session.getAttribute("user");
		System.out.println(sessionUser.getId());
		User user = service.getUserInfo(sessionUser.getId());
		ModelAndView mnv = new ModelAndView();
		
		mnv.addObject("detail", user.getUserDetail());
		mnv.addObject("info", user.getUserInfo());
		
		mnv.setViewName("privateInfomation");
		
		return mnv;
	}
}
