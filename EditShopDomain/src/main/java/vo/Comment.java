package vo;

import java.sql.Timestamp;


public class Comment {
	private int commentSeq;
	private String id;
	private int boardSeq;
	private String content;
	private Timestamp writeTime;
	private int ref;
	private int step;
	private int level;
	private int status;
	
	public int getCommentSeq() {
		return commentSeq;
	}
	public void setCommentSeq(int commentSeq) {
		this.commentSeq = commentSeq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBoardSeq() {
		return boardSeq;
	}
	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getWriteTime() {
		return writeTime;
	}
	public void setWriteTime(Timestamp writeTime) {
		this.writeTime = writeTime;
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Comment [commentSeq=" + commentSeq + ", id=" + id
				+ ", boardSeq=" + boardSeq + ", content=" + content
				+ ", writeTime=" + writeTime + ", ref=" + ref + ", step="
				+ step + ", level=" + level + ", status=" + status + "]";
	}
	
}
