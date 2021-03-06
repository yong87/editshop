package order;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import shop.cls.order.service.OrderService;
import vo.Delivery;
import vo.Order;

public class orderTest {

	@Autowired
	private OrderService os;
	
	@Before
    public void start() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
        os = ac.getBean("orderService", OrderService.class);
    }
	
	@Test
	public void newOrderProductTest(){
		
		Order order = new Order();
		
		order.setAmount(1);
		order.setProductid("1");
		order.setProductOption("green");
		order.setSellerid("test");
		order.setUserid("find");
		
		System.out.println(os.newOrderProduct(order));
		
	}
	
	@Test
	public void addDeliveryInfoTest(){
		
		Delivery del = new Delivery();
		
		del.setAddress("add");
		del.setMemo("memo!! im busy!");
		del.setName("chan");
		del.setOrdernumber("2016061000010001");
		del.setPhone("010-0000-0000");
		
		
		System.out.println(os.addDeliveryInfo(del));
	}
	
	@Test
	public void orderPaymentTest(){
		System.out.println(os.orderPayment("2016061000010001"));
	}
	
	@Test
	public void addParcelNumberTest(){
		Delivery del = new Delivery();
		
		del.setOrdernumber("2016061000010001");
		del.setInvoice("00000000000");
		del.setParcelCode(10);
		
		System.out.println(os.addParcelNumber(del));
	}
	

	
	
	
	// --------------------------------------------
	
	
	
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
