package shop.intfc.comment.entity;

import java.util.List;
import java.util.Map;

import vo.Comment;

public interface CommentEntityInter {
	public boolean addComment(Comment comment);
	public boolean modyfiComment(Comment comment);
	public boolean deleteComment(int commentSeq);
	public List<Comment> searchComment(Map<String, Object> param);
	
	public List<Comment> searchCommentBySeq(Map<String, Object> param);
	public boolean changeLevel(Comment comment);
	public boolean addReComment(Comment comment);
}
