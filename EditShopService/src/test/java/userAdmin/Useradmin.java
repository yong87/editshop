package userAdmin;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.management.openmbean.InvalidKeyException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import shop.cls.user.UserAdminService;
import shop.encryption.Crypter;
import vo.User;

public class Useradmin {

	UserAdminService uas;
	
	@Before
    public void start() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
        uas = ac.getBean("userAdminService", UserAdminService.class);
    }
	
	@Test
	public void logintest() {
		System.out.println(uas.Login("test", "1234"));
	}
	
	@Test
	public void logout() {
		System.out.println(uas.LogOut("test"));
	}
	
	@Test
	public void exit() {
		System.out.println(uas.exitUser("test", "0000"));
	}
	
	@Test
	public void adduser() {
		User user = new User();
		user.setId("test3");
		user.setPassword("0000");
		System.out.println(uas.addDetailUser(user));
	}
	
	@Test
	public void encrypt() throws InvalidKeyException, java.security.InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		Crypter cy = new Crypter();
		String en = "1234";
		System.out.println(en);
		System.out.println(cy.encrypt(en));
	}
}
