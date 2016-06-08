package mapper.order;

import vo.Order;

public interface OrderMapper {


	
	
	
	
	// --------------------------------------- 
	
	// make by hyun
	
		public boolean exchange(int ordernumber);
		public Order getOrder(int ordernumber);
		public boolean newExchangeOrder(Order order);
	
	
	
	// ---------------------------------------
	
	
	
	
	
}
