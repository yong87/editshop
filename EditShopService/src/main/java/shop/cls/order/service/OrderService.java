package shop.cls.order.service;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.intfc.order.entity.OrderEntityInter;
import shop.intfc.order.service.OrderServiceInter;
import vo.Delivery;
import vo.Order;


@Service
public class OrderService implements OrderServiceInter{

	@Autowired
	OrderEntityInter orderEntity;

	public String newOrderProduct(Order order){

		String ordernumber = generatorOrdernumber(order.getProductid());

		order.setOrdernumber(ordernumber);

		boolean isOrder = orderEntity.newOrderProduct(order);
		if(!isOrder){
			return "주문이 되지 않았습니다.";
		}

		orderEntity.newOrderTime(ordernumber);
		orderEntity.beforeInsertAddress(ordernumber);

		return ordernumber;
	}

	/**
	 * 배송정보
	 */
	public boolean addDeliveryInfo(Delivery delivery){
		//상품 정보 입력
		boolean isInputInfo = orderEntity.addDeliveryInfo(delivery);
		if(!isInputInfo){
			return false;
		}

		//상품정보 입력후 
		boolean isStatusChange = orderEntity.beforePaymentStatus(delivery.getOrdernumber());
		if(!isStatusChange){
			return false;
		}
		return true; 
	}

	/**
	 * 결제
	 */
	public boolean orderPayment(String ordernumber){
		//시간찍기
		boolean isTimeTemped = orderEntity.orderPaymentTime(ordernumber);
		if(!isTimeTemped){
			return false;
		}

		//order의Status 변경
		boolean isStatusChange = orderEntity.afterPaymentStatus(ordernumber);
		if(!isStatusChange){
			return false;
		}
		return true; 
	}

	/**
	 * 운송장 입력
	 */
	public boolean addParcelNumber(Delivery delivery){
		boolean isParcelNumber = orderEntity.modifyDeliveryInfo(delivery);
		if(!isParcelNumber){
			return false;
		}

		boolean isStatusChange = orderEntity.startDelivery(delivery.getOrdernumber());
		if(!isStatusChange){
			return false;
		}
		isStatusChange = orderEntity.startDeliveryInfo(delivery.getOrdernumber());
		if(!isStatusChange){
			return false;
		}

		return true;
	}


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
	/**
	 * 주문번호 생성
	 * @param productId
	 * @return
	 */
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
	/**
	 * 교환 log
	 * @param param
	 * @return
	 */
	private boolean addExchangeLog(Map<String, String> param) {
		return orderEntity.addExchangeLog(param);
	}



	// ---------------------------------------
	/**
	 * 취소
	 */
	public boolean cancelOrder(String ordernumber){
		return orderEntity.cancelOrder(ordernumber);
	}
	/**
	 * 반품
	 */
	public boolean returnOrder(String ordernumber){
		return orderEntity.returnOrder(ordernumber);
	}


}
