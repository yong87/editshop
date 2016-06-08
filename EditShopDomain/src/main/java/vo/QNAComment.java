package vo;

import java.sql.Timestamp;

public class QNAComment {

	
	private int seq;
	private String id;
	private String content;
	private Timestamp writetime;
	private int ref;
	private int step;
	private int level;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getWritetime() {
		return writetime;
	}
	public void setWritetime(Timestamp writetime) {
		this.writetime = writetime;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "QNAComment [seq=" + seq + ", id=" + id + ", content=" + content
				+ ", writetime=" + writetime + ", ref=" + ref + ", step="
				+ step + ", level=" + level + "]";
	}
}
