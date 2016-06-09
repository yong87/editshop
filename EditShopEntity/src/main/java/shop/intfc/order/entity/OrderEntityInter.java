package shop.intfc.order.entity;

import java.util.Map;

import vo.Delivery;
import vo.Order;


public interface OrderEntityInter {


	public boolean newOrderProduct(Order order);
	public boolean newOrderTime(String ordernumber);
	public boolean addDeliveryInfo(Delivery delivery);
	public boolean modifyDeliveryInfo(Delivery delivery);
	public boolean orderPaymentTime(String ordernumber);
	
	
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
