package order;

import org.junit.Test;

import cls.order.service.OrderService;

public class orderTest {

	
	
	
	
	
	
	
	
	
	
	// --------------------------------------------
	
	OrderService os = new OrderService();
	
	@Test
	public void generator() {
//		System.out.println(os.generatorOrdernumber("2"));
		
//		System.out.println(String.format("%04d", 13));
		
	}
	
	@Test
	public void newEx() {
		System.out.println(os.addExchange("2016060800010002"));
	}
	
	
	
	
	
	
	// --------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
}
