package oder;

import org.junit.Test;

import cls.order.entity.OrderEntity;

public class OrderTest {

	OrderEntity oe = new OrderEntity();
	
	@Test
	public void getTest(){
		System.out.println(oe.getOrder("1"));
	}
	
	@Test
	public void cancelTest(){
		System.out.println(oe.cancelOrder("2016060800010001"));
	}
	@Test
	public void returnTest(){
		System.out.println(oe.returnOrder("2016060800010001"));
	}
}
