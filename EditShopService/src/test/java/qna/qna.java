package qna;

import org.junit.Test;

import cls.qna.service.QnaService;
import vo.QNA;

public class qna {

	QnaService qs = new QnaService();

	@Test
	public void addtest() {
		QNA qna = new QNA();

		qna.setId("test");
		qna.setProductId("1");
		qna.setContent("contet");
		qna.setTitle("title");
		qna.setFlag("fla");
		qna.setFile("file");

		System.out.println(qs.addQNA(qna));
	}
	
	@Test
	public void modTest() {
		QNA qna = new QNA();
		qna.setSeq(4);
		qna.setContent("changeing-3");
		System.out.println(qs.modifyQNA(qna));
	}
	
	@Test
	public void delTest() {
		System.out.println(qs.deleteQNA(4));
	}
}
