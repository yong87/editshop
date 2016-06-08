package mapper.order;

import vo.Order;

public interface OrderMapper {


	public boolean addProductOrder(Order order);
	
	
	// --------------------------------------- 
	
	// make by hyun
	
		public boolean exchange(String ordernumber);
		public Order getOrder(String ordernumber);
		public boolean newExchangeOrder(Order order);
		
		
		public String getLastOrdernumber(String offend);
	
	
	// ---------------------------------------
	
	
	
	
	
}
