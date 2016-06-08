package intfc.order.entity;


public interface OrderEntity {


	
	
	
	
	// --------------------------------------- 
	
	// make by hyun
	
	public boolean exchange(int ordernumber);
	public vo.Order getOrder(int ordernumber);
	public boolean newExchangeOrder(vo.Order order);
	
	
	
	// ---------------------------------------
	
	
	
	
}
