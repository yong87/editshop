package shop.cls.comment.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.intfc.comment.entity.CommentEntityInter;
import shop.intfc.comment.service.CommentServiceInter;
import vo.Comment;

@Service
public class CommentService implements CommentServiceInter {

	@Autowired
	CommentEntityInter commentEntity;
	
	
	@Override
	//0602 complete test
	public boolean addComment(Comment comment) {
		return commentEntity.addComment(comment);
	
	}


	@Override
	//0602 complete test
	public boolean modyfiComment(Comment comment) {
		return commentEntity.modyfiComment(comment);
	}


	@Override
	//0602 complete test
	public boolean deleteComment(int commentSeq) {
		return commentEntity.deleteComment(commentSeq);
	}


	@Override
	//0602 complete test
	public List<Comment> searchComment(Map<String, Object> param) {
		return commentEntity.searchComment(param);
	}


	@Override
	//0602 complete test
	public boolean addReComment(int commentSeq, Comment comment) {
		
		List<Comment> refrence = commentEntity.searchCommentBySeq(commentSeq);
		
		Comment temprefrence = new Comment();

		for(Comment cv : refrence) {
			if(cv.getCommentSeq() == commentSeq) {
				temprefrence = cv;
			}
		}
		
		comment.setRef(temprefrence.getRef());
		comment.setStep(temprefrence.getStep()+1);
		comment.setLevel(refrence.size()+1);
		
		return commentEntity.addReComment(comment);
	}


	@Override
	//0602 complete test
	public boolean modyfiReComment(Comment comment) {
		return modyfiComment(comment);
	}


	@Override
	//0602 complete test
	public boolean deleteReComment(int commentSeq) {
		return deleteComment(commentSeq);
	}
	
	




	
}
