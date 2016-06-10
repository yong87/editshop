package qna;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import shop.cls.qna.service.QnaService;
import vo.QNA;

public class qna {

	@Autowired
	private QnaService qs;

	@Before
    public void start() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
        qs = ac.getBean("qnaService", QnaService.class);
    }
	
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
