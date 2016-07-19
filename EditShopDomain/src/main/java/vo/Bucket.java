package vo;

public class Bucket {

	private String userId;
	private String productId;
	private int buyCount;
	private String option;
	private int status;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getBuyCount() {
		return buyCount;
	}
	public void setBuyCount(int buyCount) {
		this.buyCount = buyCount;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Bucket [userId=" + userId + ", productId=" + productId
				+ ", buyCount=" + buyCount + ", option=" + option + ", status="
				+ status + "]";
	}
	
	
}
