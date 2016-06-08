package oder;

import org.junit.Test;

import cls.order.entity.OrderEntity;

public class OrderTest {

	OrderEntity oe = new OrderEntity();
	
	@Test
	public void getTest(){
		System.out.println(oe.getOrder("1"));
	}
}
