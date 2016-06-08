package intfc.order.service;

import vo.Order;

public interface OrderService {


	
	
	
	// --------------------------------------- 
	
	// make by hyun
	
		public boolean exchange(String ordernumber);
		public Order getOrder(String ordernumber);
		public boolean newExchangeOrder(Order order);
	
	
	
	// ---------------------------------------
	
	
	
	
}
