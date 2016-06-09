package userAd;

import org.junit.Test;

import shop.cls.user.entity.UserAdminEntity;

public class userAd {

	UserAdminEntity uae = new UserAdminEntity();
	
	@Test
	public void returnlang() {
		System.out.println(uae.returnLanguage("test"));
	}
}
