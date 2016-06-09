package oder;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import shop.cls.order.entity.OrderEntity;
import vo.Delivery;
import vo.Order;

public class OrderTest {

	OrderEntity oe = new OrderEntity();
	
	/** park **/
	@Test
	public void newOrderProductTest(){
		
		Order order = new Order();
		order.setAmount(1);
		order.setOrdernumber("2016060800010008");
		order.setProductid("1");
		order.setProductOption("blue");
		order.setSellerid("test");
		order.setUserid("test");
		
		System.out.println(oe.newOrderProduct(order));
		
	}
	
	@Test
	public void newOrderTimeTest(){
		System.out.println(oe.newOrderTime("2016060800010008"));
	}
	
	@Test
	public void addDeliveryInfoTest(){
		Delivery del = new Delivery();
		
		del.setAddress("address");
		del.setMemo("memo!! come back home");
		del.setName("park");
		del.setOrdernumber("2016060900010002");
		del.setPhone("010-0000-0000");
		
		System.out.println(oe.addDeliveryInfo(del));
		
	}
	
	@Test
	public void modifyDeliveryInfoTest(){
		
		Delivery del = new Delivery();
		del.setInvoice("000000000");
		del.setParcelCode(12);
		del.setOrdernumber("2016060900010004");
		
		System.out.println(oe.modifyDeliveryInfo(del));
		
	}
	
	@Test
	public void orderPaymentTimeTest(){
		System.out.println(oe.orderPaymentTime("2016060800010008"));
	}
	
	/** hyun **/
	
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
