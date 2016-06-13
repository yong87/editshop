package oder;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import shop.cls.order.entity.OrderEntity;
import vo.Delivery;
import vo.Order;
import vo.OrderInfo;

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
	
	
	@Test
	public void orderChangeStatusTest(){
		System.out.println(oe.buyconfirmStatus("2016060800010001"));
		System.out.println(oe.beforePaymentStatus("2016060800010002"));
		System.out.println(oe.afterPaymentStatus("2016060800010003"));
		System.out.println(oe.beforeInsertAddress("2016060800010004"));
		System.out.println(oe.checkOrderbySeller("2016060800010005"));
		System.out.println(oe.readyProductbySeller("2016060800010006"));
		System.out.println(oe.startDelivery("2016060800010007"));
		System.out.println(oe.sendDelivery("2016060800010008"));
		System.out.println(oe.completeDelivery("2016060900010001"));
		System.out.println(oe.exchangeStatus("2016060900010002"));
		System.out.println(oe.cancelOrderStatus("2016060900010003"));
		System.out.println(oe.refundStatus("2016060900010004"));
	}
	
	@Test
	public void deliveryInfoStatusChangeTest(){
		System.out.println(oe.startDeliveryInfo("2016060900010001"));
		System.out.println(oe.sendDeliveryInfo("2016060900010002"));
		System.out.println(oe.completeDeliveryInfo("2016060900010003"));
	}
	
	@Test
	public void getOrderInfoTest(){
		OrderInfo oi = oe.getOrderInfo("2016060800010008");
		
		System.out.println(oi.toString());
	}
	
	@Test
	public void getDeliveryInfoTest(){
		Delivery del = oe.getDeliveryInfo("2016060900010001");
		
		System.out.println(del.toString());
		
	}
	
	@Test
	public void getOrderByParcelNumberTest(){
		Order order = oe.getOrderByParcelNumber("001001000");
		System.out.println(order.toString());
	}
	
	@Test
	public void getOrderInfoByParcelNumberTest(){
		OrderInfo oi = oe.getOrderInfoByParcelNumber("000000000");
		System.out.println(oi.toString());
	}
	
	@Test
	public void getDeliveryInfoByParcelNumberTest(){
		Delivery del = oe.getDeliveryInfoByParcelNumber("000000001");
		System.out.println(del.toString());
	}
	
	@Test
	public void getOrderByUserIdTest(){
		List<Order> orders = oe.getOrderByUserId("test");
		
		for(Order order : orders){
			System.out.println(order.toString());
		}
	
	}
	
	@Test
	public void getDeliveryByUserIdTest(){
		List<Delivery> dels = oe.getDeliveryByUserId("test");
		
		for(Delivery del : dels){
			System.out.println(del.toString());
		}
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
