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
	 * ordernumber로 order찾아오기(1개) //db
	 * ordernumber로 orderInfo찾아오기(1개) //db
	 * ordernumber로 deliveryInfo찾아오기(1개) //db 
	 * parcelNumber(invoice)로 deliveryInfo찾아오기 //db
	 * parcelNumber(invoice)로 order찾아오기 // db
	 * parcelNumber(invoice)로 orderInfo찾아오기  // db
	 */
	

	// --------------------------------------- 

	// make by hyun

	public boolean addExchange(String ordernumber);


	// ---------------------------------------
	public boolean cancelOrder(String ordernumber);

	public boolean returnOrder(String ordernumber);


}
