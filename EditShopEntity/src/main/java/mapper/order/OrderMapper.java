package mapper.order;

import vo.Order;

public interface OrderMapper {


	
	
	
	
	// --------------------------------------- 
	
	// make by hyun
	
		public boolean exchange(String ordernumber);
		public Order getOrder(String ordernumber);
		public boolean newExchangeOrder(Order order);
	
	
	
	// ---------------------------------------
	
	
	
	
	
}
