package shop.cls.qna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.intfc.qna.entity.QnaEntityInter;
import shop.intfc.qna.service.QnaServiceInter;
import vo.QNA;

@Service
public class QnaService implements QnaServiceInter{

	@Autowired
	QnaEntityInter qnaEntity;
	
	@Override
	public boolean addQNA(QNA qna) {
		return qnaEntity.addQNA(qna);
	}


	@Override
	public boolean modifyQNA(QNA qna) {
		return qnaEntity.modifyQNA(qna);
	}


	@Override
	public boolean deleteQNA(int seq) {
		return qnaEntity.deleteQNA(seq);
	}

	
}
