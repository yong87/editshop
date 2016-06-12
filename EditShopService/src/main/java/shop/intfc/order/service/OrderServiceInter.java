package shop.intfc.order.service;

import vo.Delivery;
import vo.Order;


public interface OrderServiceInter {
	
	//user
	public String newOrderProduct(Order order);
	public boolean addDeliveryInfo(Delivery delivery);
	public boolean orderPayment(String ordernumber);
	
	//seller
	public boolean addParcelNumber(Delivery delivery);
	
	/**
	 * Status로 찾기
	 * Order List로 가져오기
	 * OrderInfo List로 가져오기
	 * DeliveryInfo List로 가져오기
	 */
	

	// --------------------------------------- 

	// make by hyun

	public boolean addExchange(String ordernumber);


	// ---------------------------------------
	public boolean cancelOrder(String ordernumber);

	public boolean returnOrder(String ordernumber);


}
