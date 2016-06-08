package intfc.order.entity;

import vo.Order;


public interface OrderEntity {


	
	
	
	
	// --------------------------------------- 
	
	// make by hyun
	
	public boolean exchange(int ordernumber);
	public Order getOrder(int ordernumber);
	public boolean newExchangeOrder(Order order);
	
	
	
	// ---------------------------------------
	
	
	
	
}
