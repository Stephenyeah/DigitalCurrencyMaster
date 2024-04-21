package haagahelia.zhenyu.DigitalCurrencyMaster.service;


import haagahelia.zhenyu.DigitalCurrencyMaster.model.SellingQuestion;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.repository.SellingQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellingQuestionServiceImpl implements SellingQuestionService {

    @Autowired
    private SellingQuestionRepository sellingQuestionRepository;

    @Override
    public List<SellingQuestion> getAllSellingQuestions() {
        return sellingQuestionRepository.findAll();
    }

    @Override
    public void saveSellingQuestion(SellingQuestion question) {
        sellingQuestionRepository.save(question);
    }
}
