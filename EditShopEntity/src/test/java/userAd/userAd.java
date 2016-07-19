package userAd;

import java.util.List;

import org.junit.Test;

import shop.cls.user.entity.UserAdminEntity;
import vo.User;
import vo.UserDetail;

public class userAd {

	UserAdminEntity uae = new UserAdminEntity();
	
	@Test
	public void returnlang() {
		System.out.println(uae.returnLanguage("test"));
	}
	
	@Test
	public void userDetailTest(){
		List<UserDetail> users = uae.getUserDetailByEmail("krok3");
		
		for(UserDetail user : users){
			System.out.println(user.toString());
		}
	}
	
	@Test
	public void changePwdTest(){
		User user = new User();
		
		user.setId("addtest2");
		user.setPassword("ddd");
		
		System.out.println(uae.modifyUserPwd(user));
	}
}
