package emailling;

import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import shop.cls.order.service.OrderService;
import shop.cls.user.UserAdminService;

public class emailTEst {

	@Autowired
	private UserAdminService uas;
	
	@Before
    public void start() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
        uas = ac.getBean("userAdminService", UserAdminService.class);
    }
	
	@Test
	public void email() throws ParseException {
		

		uas.addUser("test7", "1234", "xplay84@gmail.com");
		
		
	}

}
