package intfc.order.service;


public interface OrderService {


	
	
	
	// --------------------------------------- 
	
	// make by hyun
	
		public boolean addExchange(String ordernumber);
		
	
	
	
	// ---------------------------------------
		public boolean cancelOrder(String ordernumber);
		
		public boolean returnOrder(String ordernumber);
	
	
}
