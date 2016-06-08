package intfc.order.entity;

import java.util.Map;

import vo.Order;


public interface OrderEntity {


	
	
	
	
	// --------------------------------------- 
	
	// make by hyun
	
	public boolean exchange(String ordernumber);
	public Order getOrder(String ordernumber);
	public boolean newExchangeOrder(Order order);
	
	public String getLastOrdernumber(String offend);
	public boolean addExchangeLog(Map<String, String> param);
	
	// ---------------------------------------
	public boolean cancelOrder(String ordernumber);
	
	public boolean returnOrder(String ordernumber);
	
	
}
