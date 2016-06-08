package cls.order.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import vo.Order;
import intfc.order.entity.OrderEntity;


public class OrderService implements intfc.order.service.OrderService{
	OrderEntity orderEntity = new cls.order.entity.OrderEntity();

	

	
	
	
	// --------------------------------------- 
	
	// make by hyun
	@Override
	public boolean addExchange(String ordernumber) {
/**
 * 1. 원래의 ordernumber를 기준으로 order를 받아온다
 * 2. order에 있던 정보를 몽땅 다 새로운 order에 넣고 ordernumber를 붙인다
 * 3. exchange테이블에 원래 정보와 새로운 정보를 넣는다
 * 4. 자료를 요청하면 새로운 정보를 리턴한다
 */
		
		Order beforeOrder = orderEntity.getOrder(ordernumber);
		
		
		
		
		
		return false;
	}
	
	public String generatorOrdernumber(String productId){
		
		StringBuffer sb = new StringBuffer();
		sb.append(new SimpleDateFormat("yyyyMMdd").format(new Date())); //20160608
		sb.append(String.format("%04d", Integer.parseInt(productId))); // 0001
		
		System.out.println("main " +sb.toString());	//201606080001
		
		//201606080002
		String offend = orderEntity.getLastOrdernumber(sb.toString()); 
		System.out.println(offend); //201606080002
		
		int temp =0;
		
		if(!(offend == null)) {
			System.out.println("13");
			temp = Integer.parseInt(offend.substring(offend.length()-4, offend.length()));
		}
		System.out.println("temp : " +temp);
		sb.append(String.format("%04d", ++temp)); //0003
		
		
		return sb.toString(); //2016060800010003
		
	}
	
	
	
	// ---------------------------------------
	
	
	
	
}
