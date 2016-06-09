package cls.qna.service;

import intfc.qna.entity.QnaEntityInter;
import intfc.qna.service.QnaServiceInter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
