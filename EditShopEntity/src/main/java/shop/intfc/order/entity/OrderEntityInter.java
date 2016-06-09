package shop.intfc.order.entity;

import java.util.Map;

import vo.Delivery;
import vo.Order;


public interface OrderEntityInter {


	/**
	 * 구매관련 method
	 */
	public boolean newOrderProduct(Order order);
	public boolean newOrderTime(String ordernumber);
	public boolean addDeliveryInfo(Delivery delivery);
	public boolean modifyDeliveryInfo(Delivery delivery);
	public boolean orderPaymentTime(String ordernumber);
	
	/**
	 * Status 관련 method
	 */
	public boolean buyconfirmStatus(String ordernumber);
	public boolean beforePaymentStatus(String ordernumber);
	public boolean afterPaymentStatus(String ordernumber);
	public boolean beforeInsertAddress(String ordernumber);
	public boolean checkOrderbySeller(String ordernumber);
	public boolean readyProductbySeller(String ordernumber);
	public boolean startDelivery(String ordernumber);
	public boolean sendDelivery(String ordernumber);
	public boolean completeDelivery(String ordernumber);
	public boolean exchangeStatus(String ordernumber);
	public boolean cancelOrderStatus(String ordernumber);
	public boolean refundStatus(String ordernumber);
	
	
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
