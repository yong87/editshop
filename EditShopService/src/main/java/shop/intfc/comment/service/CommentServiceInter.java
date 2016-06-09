package shop.intfc.comment.service;

import java.util.List;
import java.util.Map;

import vo.Comment;

public interface CommentServiceInter {

	public boolean addComment(Comment comment);
	public boolean modyfiComment(Comment comment);
	public boolean deleteComment(int commentSeq);
	public List<Comment> searchComment(Map<String, Object> param);
	
	public boolean addReComment(int commentSeq, Comment comment);
	public boolean modyfiReComment(Comment comment);
	public boolean deleteReComment(int commentSeq);
}
