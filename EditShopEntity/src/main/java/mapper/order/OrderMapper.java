package mapper.order;

import java.util.Map;

import vo.Order;

public interface OrderMapper {


	
	
	
	
	// --------------------------------------- 
	
	// make by hyun
	
		public boolean exchange(String ordernumber);
		public Order getOrder(String ordernumber);
		public boolean newExchangeOrder(Order order);
		
		
		public String getLastOrdernumber(String offend);
		public boolean addExchangeLog(Map<String, String> param);
	
	// ---------------------------------------
	
	
	
	
	
}
