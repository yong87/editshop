package qna;

import org.junit.Test;

import cls.qna.entity.QnaCommentEntity;
import cls.qna.entity.QnaEntity;
import vo.QNA;
import vo.QNAComment;

public class qna {

	QnaEntity qe = new QnaEntity();
	QnaCommentEntity qce = new QnaCommentEntity();
	
	@Test
	public void addqnd() {
		QNA qna = new QNA();
		
		qna.setId("test");
		qna.setProductId("1");
		qna.setContent("contet");
		qna.setTitle("title");
		qna.setFlag("fla");
		qna.setFile("file");
		
		qe.addQNA(qna);
	}
	
	@Test
	public void addtest() {
		QNAComment qc = new QNAComment();
		qc.setSeq(3);
		qc.setId("test");
		qc.setContent("content");
		
		qce.addQNAComment(qc);
		
	}
}
