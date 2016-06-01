package vo;

import java.sql.Timestamp;

public class Board {

	private int seq;
	private String id;
	private String title;
	private String content;
	private Timestamp writetime;
	private String file;
	private String flag;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Board [seq=" + seq + ", id=" + id + ", title=" + title
				+ ", content=" + content + ", writetime=" + writetime
				+ ", file=" + file + ", flag=" + flag + "]";
	}
	
	
	
}
