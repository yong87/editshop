package cls.order.service;

import cls.order.entity.OrderEntity;
import vo.Order;

public class OrderService {

	

	
	
	
	// --------------------------------------- 
	
	// make by hyun
	
		public boolean exchange(String ordernumber) {
			return false;
			
		}
		public Order getOrder(String ordernumber) {
			return null;
			
		}
		public boolean newExchangeOrder(Order order){
			return false;
			
		}
	
	
	
	// ---------------------------------------
		public boolean cancelOrder(String ordernumber){
			OrderEntity orderEntity = new OrderEntity();
			return orderEntity.cancelOrder(ordernumber);
		}
		public boolean returnOrder(String ordernumber){
			OrderEntity orderEntity = new OrderEntity();
			return orderEntity.returnOrder(ordernumber);
		}
	
	
}
