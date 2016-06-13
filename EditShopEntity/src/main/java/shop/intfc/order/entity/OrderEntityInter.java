package shop.intfc.order.entity;

import java.util.List;
import java.util.Map;

import vo.Delivery;
import vo.Order;
import vo.OrderInfo;


public interface OrderEntityInter {


	/**
	 * 구매관련 method
	 */
	public boolean newOrderProduct(Order order);
	public boolean newOrderTime(String ordernumber);
	public boolean addDeliveryInfo(Delivery delivery);
	public boolean modifyDeliveryInfo(Delivery delivery);
	public boolean orderPaymentTime(String ordernumber);
	
	/**
	 * Order Status 관련 method
	 */
	public boolean buyconfirmStatus(String ordernumber);
	public boolean beforePaymentStatus(String ordernumber);
	public boolean afterPaymentStatus(String ordernumber);
	public boolean beforeInsertAddress(String ordernumber);
	public boolean checkOrderbySeller(String ordernumber);
	public boolean readyProductbySeller(String ordernumber);
	public boolean startDelivery(String ordernumber);
	public boolean sendDelivery(String ordernumber);
	public boolean completeDelivery(String ordernumber);
	public boolean exchangeStatus(String ordernumber);
	public boolean cancelOrderStatus(String ordernumber);
	public boolean refundStatus(String ordernumber);
	
	/**
	 * DeliveryInfo Status 관련
	 */
	public boolean sendDeliveryInfo(String ordernumber);
	public boolean completeDeliveryInfo(String ordernumber);
	public boolean startDeliveryInfo(String ordernumber);
	
	/**
	 * ordernumber로 찾기
	 */
	public OrderInfo getOrderInfo(String ordernumber);
	public Delivery getDeliveryInfo(String ordernumber);
	
	/**
	 * parcelnumber로 찾기
	 */
	public Order getOrderByParcelNumber(String parcelnumber);
	public OrderInfo getOrderInfoByParcelNumber(String parcelnumber);
	public Delivery getDeliveryInfoByParcelNumber(String parcelnumber);
	
	/**
	 * userId로 Order찾기
	 */

	public List<Order> getOrderByUserId(String userId);
	public List<Delivery> getDeliveryByUserId(String userId);
	
	/**
	 * SellerId로 Order찾기
	 */

	public List<Order> getOrderBySellerId(String sellerId);
	public List<Delivery> getDeliveryBySellerId(String sellerId);
	
	/**
	 * 관리자 Order전부 가져오기
	 */
	public List<Order> getAllOrder();
	public List<OrderInfo> getAllOrderInfo();
	public List<Delivery> getAllDelivery();
	
	/**
	 * Status로 가져오기
	 */
	public List<Order> getOrderByStatus(int status);
	public List<OrderInfo> getOrderInfoByStatus(int status);
	public List<Delivery> getDeliveryByStatus(int status);
	
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
