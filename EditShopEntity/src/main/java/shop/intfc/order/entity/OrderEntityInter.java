package shop.intfc.order.entity;

import java.util.Map;

import vo.Delivery;
import vo.Order;
import vo.OrderInfo;


public interface OrderEntityInter {


	public boolean newOrderProduct(Order order);
	public boolean newOrderTime(OrderInfo order);
	public boolean addDeliveryInfo(Delivery delivery);
	public boolean modifyDeliveryInfo(Delivery delivery);
	public boolean orderPaymentTime(OrderInfo order);
	
	
	// --------------------------------------- 
	
	// make by hyun
	
	public boolean exchange(String ordernumber);
	public Order getOrder(String ordernumber);
	public boolean newExchangeOrder(Order order);
	
	public String getLastOrdernumber(String offend);
	public boolean addExchangeLog(Map<String, String> param);
	
	// ---------------------------------------
	public boolean cancelOrder(String ordernumber);
	
	public boolean returnOrder(String ordernumber);
	
	
}
