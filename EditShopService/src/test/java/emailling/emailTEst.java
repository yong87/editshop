package emailling;

import java.text.ParseException;

import org.junit.Test;

import cls.user.UserAdminService;

public class emailTEst {

	@Test
	public void email() throws ParseException {
		

		UserAdminService uas = new UserAdminService();
		uas.addUser("test7", "1234", "xplay84@gmail.com");
		
		
	}

}
