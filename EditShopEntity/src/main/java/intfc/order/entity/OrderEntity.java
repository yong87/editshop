package intfc.order.entity;

import vo.Order;


public interface OrderEntity {


	
	
	
	
	// --------------------------------------- 
	
	// make by hyun
	
	public boolean exchange(String ordernumber);
	public Order getOrder(String ordernumber);
	public boolean newExchangeOrder(Order order);
	
	
	
	// ---------------------------------------
	
	
	
	
}
