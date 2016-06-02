package vo;

import java.sql.Timestamp;

public class ReviewVo {
	private String ordernumber;
	private String content;
	private int point;
	private int like;
	private int hate;
	private Timestamp writetime;
	
	public ReviewVo(String ordernumber, String content, int point, int like,
			int hate, Timestamp writetime) {
		super();
		this.ordernumber = ordernumber;
		this.content = content;
		this.point = point;
		this.like = like;
		this.hate = hate;
		this.writetime = writetime;
	}

	public ReviewVo() {
		super();
	}

	public String getOrdernumber() {
		return ordernumber;
	}

	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getHate() {
		return hate;
	}

	public void setHate(int hate) {
		this.hate = hate;
	}

	public Timestamp getWritetime() {
		return writetime;
	}

	public void setWritetime(Timestamp writetime) {
		this.writetime = writetime;
	}

	@Override
	public String toString() {
		return "ReviewVo [ordernumber=" + ordernumber + ", content=" + content
				+ ", point=" + point + ", like=" + like + ", hate=" + hate
				+ ", writetime=" + writetime + "]";
	}
	
}
