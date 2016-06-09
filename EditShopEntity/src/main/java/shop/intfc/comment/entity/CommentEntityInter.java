package shop.intfc.comment.entity;

import java.util.List;

import vo.Comment;

public interface CommentEntityInter {
	public boolean addComment(Comment comment);
	public boolean modyfiComment(Comment comment);
	public boolean deleteComment(int commentSeq);
	public List<Comment> searchComment(String content);
	
	public List<Comment> searchCommentBySeq(int commentSeq);
	public boolean changeLevel(Comment comment);
	public boolean addReComment(Comment comment);
}
