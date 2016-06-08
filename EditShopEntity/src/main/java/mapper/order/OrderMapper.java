package mapper.order;

import vo.Order;

public interface OrderMapper {


	
	
	
	
	// --------------------------------------- 
	
	// make by hyun
	
		public boolean exchange(String ordernumber);
		public Order getOrder(String ordernumber);
		public boolean newExchangeOrder(Order order);
	
	
	
	// ---------------------------------------
	
	public boolean cancelOrder(String ordernumber);
	
	public boolean  returnOrder(String ordernumber);
	
	
}
