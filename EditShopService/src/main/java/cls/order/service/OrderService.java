package cls.order.service;


import intfc.order.entity.OrderEntityInter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import vo.Order;
import cls.order.entity.OrderEntity;



public class OrderService implements intfc.order.service.OrderServiceInter{
	OrderEntityInter orderEntity = new cls.order.entity.OrderEntity();

	

	
	
	
	// ---------------------------------------// 
	
	// make by hyun
	// 0608 complete test
	@Override
	public boolean addExchange(String ordernumber) {
/**
 * 1. 원래의 ordernumber를 기준으로 order를 받아온다
 * 2. order에 있던 정보를 몽땅 다 새로운 order에 넣고 ordernumber를 붙인다
 * 3. exchange테이블에 원래 정보와 새로운 정보를 넣는다
 * 4. 자료를 요청하면 새로운 정보를 리턴한다
 */
		
		Order beforeOrder = orderEntity.getOrder(ordernumber);
		Order newOrder = beforeOrder;
		newOrder.setOrdernumber(generatorOrdernumber(beforeOrder.getProductid()));
		
		if(!orderEntity.newExchangeOrder(newOrder)) return false;
		

		Map<String, String> param = new HashMap<String, String>();
		
		param.put("original", ordernumber);
		param.put("chaser", newOrder.getOrdernumber());
		
		if(!addExchangeLog(param)) return false;
		
		return true;
	}
	
	private String generatorOrdernumber(String productId){
		
		StringBuffer sb = new StringBuffer();
		sb.append(new SimpleDateFormat("yyyyMMdd").format(new Date())); //20160608
		sb.append(String.format("%04d", Integer.parseInt(productId))); // 0001
		
		
		//201606080002
		String offend = orderEntity.getLastOrdernumber(sb.toString()); 
		
		int temp =0;
		
		if(!(offend == null)) {
			temp = Integer.parseInt(offend.substring(offend.length()-4, offend.length()));
		}
		sb.append(String.format("%04d", ++temp)); //0003

		
		return sb.toString(); //2016060800010003
		
	}
	
	private boolean addExchangeLog(Map<String, String> param) {
		return orderEntity.addExchangeLog(param);
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
