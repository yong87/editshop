package userAd;

import java.util.List;

import org.junit.Test;

import shop.cls.user.entity.UserAdminEntity;
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
}
