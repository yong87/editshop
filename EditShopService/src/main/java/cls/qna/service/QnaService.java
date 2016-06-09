package cls.qna.service;

import intfc.qna.entity.QnaEntityInter;
import vo.QNA;

public class QnaService implements intfc.qna.service.QnaService{

	
	QnaEntityInter qnaEntity = new cls.qna.entity.QnaEntity();
	
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
