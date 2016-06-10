package shop.intfc.order.service;

import vo.Order;


public interface OrderServiceInter {

		public String newOrderProduct(Order order);
		
	
	
	
	// --------------------------------------- 
	
	// make by hyun
	
		public boolean addExchange(String ordernumber);
		
	
	
	
	// ---------------------------------------
		public boolean cancelOrder(String ordernumber);
		
		public boolean returnOrder(String ordernumber);
	
	
}
