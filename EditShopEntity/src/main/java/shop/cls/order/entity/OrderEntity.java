package shop.cls.order.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mapper.order.OrderMapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import session.ShopSqlSessionFactory;
import shop.intfc.order.entity.OrderEntityInter;
import vo.Delivery;
import vo.Order;
import vo.OrderInfo;

@Repository
public class OrderEntity implements OrderEntityInter{

	/**
	 * 주문 생성
	 */
	public boolean newOrderProduct(Order order){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.newOrderProduct(order);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 주문생성후 time찍는 method
	 */
	public boolean newOrderTime(String ordernumber){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.newOrderTime(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 주문생성후 주문정보 입력  method
	 */
	public boolean addDeliveryInfo(Delivery delivery){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.addDeliveryInfo(delivery);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 주문정보 수정하는 method
	 */
	public boolean modifyDeliveryInfo(Delivery delivery){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.modifyDeliveryInfo(delivery);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
		
	}
	
	/**
	 * 결제후 결제 시간을 찍는 method
	 */
	public boolean orderPaymentTime(String ordernumber){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.orderPaymentTime(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 구매 확정
	 */
	@Override
	public boolean buyconfirmStatus(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.buyconfirmStatus(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 결제 전 : 50
	 */
	public boolean beforePaymentStatus(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.beforePaymentStatus(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 결재후 : 51
	 */
	public boolean afterPaymentStatus(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.afterPaymentStatus(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 배송정보 미입력시 52
	 */
	public boolean beforeInsertAddress(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.beforeInsertAddress(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 물품 확인시 : 53
	 */
	public boolean checkOrderbySeller(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.checkOrderbySeller(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 배송물품 준비 : 54
	 */
	public boolean readyProductbySeller(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.readyProductbySeller(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 배송 시작시 : 55
	 */
	public boolean startDelivery(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.startDelivery(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 배송중시 Status : 56
	 */
	public boolean sendDelivery(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.sendDelivery(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 배송완료시 Status : 57
	 */
	public boolean completeDelivery(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.completeDelivery(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 교환시 Status : 58
	 */
	public boolean exchangeStatus(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.exchangeStatus(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 취소시 status 59
	 */
	public boolean cancelOrderStatus(String ordernumber){
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.cancelOrderStatus(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 환불시 Status : 60
	 */
	public boolean refundStatus(String ordernumber){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.refundStatus(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 배송중 딜리버리 인포
	 */
	public boolean sendDeliveryInfo(String ordernumber){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.sendDeliveryInfo(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 배송 완료 딜리버리 인포
	 */
	public boolean completeDeliveryInfo(String ordernumber){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.completeDeliveryInfo(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * 배송시작 딜리버리 인포
	 */
	public boolean startDeliveryInfo(String ordernumber){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		boolean isCreate;
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			isCreate = orderMapper.startDeliveryInfo(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sqlSession.close();
		}
		
		return isCreate;
	}
	
	/**
	 * ordernumber로 OrderInfo찾기
	 */
	public OrderInfo getOrderInfo(String ordernumber){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		OrderInfo orderInfo = new OrderInfo();
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			orderInfo = orderMapper.getOrderInfo(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			sqlSession.close();
		}
		
		return orderInfo;
	}
	
	/**
	 * ordernumber로 DeliveryInfo찾기
	 */
	public Delivery getDeliveryInfo(String ordernumber){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		Delivery delivery = new Delivery();
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			delivery = orderMapper.getDeliveryInfo(ordernumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			sqlSession.close();
		}
		
		return delivery;
	}
	
	/**
	 * 송장번호로 Order찾기
	 */
	public Order getOrderByParcelNumber(String parcelnumber){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		Order order= new Order();
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			order = orderMapper.getOrderByParcelNumber(parcelnumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			sqlSession.close();
		}
		
		return order;
	}
	
	/**
	 * 송장번호로 OrderInfo찾기
	 */
	public OrderInfo getOrderInfoByParcelNumber(String parcelnumber){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		OrderInfo orderInfo= new OrderInfo();
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			orderInfo = orderMapper.getOrderInfoByParcelNumber(parcelnumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			sqlSession.close();
		}
		
		return orderInfo;
	}
	
	/**
	 * 송장번호로 DeliveryInfo찾기
	 */
	public Delivery getDeliveryInfoByParcelNumber(String parcelnumber){
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		Delivery delivery = new Delivery();
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			delivery = orderMapper.getDeliveryInfoByParcelNumber(parcelnumber);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			sqlSession.close();
		}
		
		return delivery;
	}
	
	/**
	 * userId로 가져오기
	 */
	@Override
	public List<Order> getOrderByUserId(String userId) {

		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<Order> orders = new ArrayList<Order>();
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			orders = orderMapper.getOrderByUserId(userId);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			sqlSession.close();
		}
		
		return orders;

	}

	@Override
	public List<Delivery> getDeliveryByUserId(String userId) {

		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<Delivery> delivery = new ArrayList<Delivery>();
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			delivery = orderMapper.getDeliveryByUserId(userId);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			sqlSession.close();
		}
		
		return delivery;
	}

	/**
	 * sellerId로 가져오기
	 */
	@Override
	public List<Order> getOrderBySellerId(String sellerId) {
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<Order> orders = new ArrayList<Order>();
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			orders = orderMapper.getOrderBySellerId(sellerId);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			sqlSession.close();
		}
		
		return orders;
	}

	@Override
	public List<Delivery> getDeliveryBySellerId(String sellerId) {
		 
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<Delivery> delivery = new ArrayList<Delivery>();
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			delivery = orderMapper.getDeliveryBySellerId(sellerId);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			sqlSession.close();
		}
		
		return delivery;
	}

	/**
	 * 관리자 모든정보
	 */
	@Override
	public List<Order> getAllOrder() {
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<Order> orders = new ArrayList<Order>();
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			orders = orderMapper.getAllOrder();
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			sqlSession.close();
		}
		
		return orders;
	}

	@Override
	public List<OrderInfo> getAllOrderInfo() {
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<OrderInfo> orderInfos = new ArrayList<OrderInfo>();
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			orderInfos = orderMapper.getAllOrderInfo();
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			sqlSession.close();
		}
		
		return orderInfos;
	}

	@Override
	public List<Delivery> getAllDelivery() {
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<Delivery> deliveryList = new ArrayList<Delivery>();
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			deliveryList = orderMapper.getAllDelivery();
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			sqlSession.close();
		}
		
		return deliveryList;
	}

	/**
	 * Status로 가져오기
	 */
	@Override
	public List<Order> getOrderByStatus(int status) {
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<Order> orders = new ArrayList<Order>();
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			orders = orderMapper.getOrderByStatus(status);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			sqlSession.close();
		}
		
		return orders;
	}

	@Override
	public List<OrderInfo> getOrderInfoByStatus(int status) {
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<OrderInfo> orderInfoList = new ArrayList<OrderInfo>();
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			orderInfoList = orderMapper.getOrderInfoByStatus(status);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			sqlSession.close();
		}
		
		return orderInfoList;
	}

	@Override
	public List<Delivery> getDeliveryByStatus(int status) {
		
		SqlSession sqlSession = ShopSqlSessionFactory.getInstance().getSqlSession();
		List<Delivery> deliveryList = new ArrayList<Delivery>();
		try{
			OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
			deliveryList = orderMapper.getDeliveryByStatus(status);
			
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			sqlSession.close();
		}
		
		return deliveryList;
	}

	// --------------------------------------- 
	// make by hyun
	@Override
	public boolean exchange(String ordernumber) {

		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			OrderMapper orderMapper = sqlsession
					.getMapper(OrderMapper.class);

			orderMapper.exchange(ordernumber);
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
		
	}

	@Override
	public Order getOrder(String ordernumber) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		vo.Order order = new vo.Order();
		
		try {
			OrderMapper orderMapper = sqlsession
					.getMapper(OrderMapper.class);

			order = orderMapper.getOrder(ordernumber);
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			sqlsession.close();
		}
		return order;
	}

	@Override
	public boolean newExchangeOrder(Order order) {

		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			OrderMapper orderMapper = sqlsession
					.getMapper(OrderMapper.class);

			orderMapper.newExchangeOrder(order);
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
		
	}

	@Override
	public String getLastOrdernumber(String offend) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		String returnStr = null;
		
		try {
			OrderMapper orderMapper = sqlsession
					.getMapper(OrderMapper.class);

			returnStr = orderMapper.getLastOrdernumber(offend);
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			sqlsession.close();
		}
		return returnStr;
		
	}

	@Override
	public boolean addExchangeLog(Map<String, String> param) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();
		
		try {
			OrderMapper orderMapper = sqlsession
					.getMapper(OrderMapper.class);

			orderMapper.addExchangeLog(param);
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}

	
	
	
	
	// ---------------------------------------
	
	@Override
	public boolean cancelOrder(String ordernumber) {
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			OrderMapper orderMapper = sqlsession
					.getMapper(OrderMapper.class);

			orderMapper.cancelOrder(ordernumber);
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}
	
	public boolean returnOrder(String ordernumber){
		SqlSession sqlsession = ShopSqlSessionFactory.getInstance()
				.getSqlSession();

		try {
			OrderMapper orderMapper = sqlsession
					.getMapper(OrderMapper.class);

			orderMapper.returnOrder(ordernumber);
			
			sqlsession.commit();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			sqlsession.close();
		}
		return true;
	}
	
}
