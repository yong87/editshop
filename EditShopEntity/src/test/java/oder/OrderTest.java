package oder;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import shop.cls.order.entity.OrderEntity;

public class OrderTest {

	OrderEntity oe = new OrderEntity();
	
	@Test
	public void getTest(){
		System.out.println(oe.getOrder("2016060800010001"));
	}
	
	@Test
	public void cancelTest(){
		System.out.println(oe.cancelOrder("2016060800010001"));
	}
	@Test
	public void returnTest(){
		System.out.println(oe.returnOrder("2016060800010001"));
	}
	
	@Test
	public void listTest() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(11);
		list2.add(12);
		list2.add(13);
		
		for(int temp : list) {
			System.out.println(temp);
		}
		
	}
}
