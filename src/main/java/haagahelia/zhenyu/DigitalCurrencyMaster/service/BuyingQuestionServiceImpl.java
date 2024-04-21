package haagahelia.zhenyu.DigitalCurrencyMaster.service;


import haagahelia.zhenyu.DigitalCurrencyMaster.model.BuyingQuestion;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.repository.BuyingQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyingQuestionServiceImpl implements BuyingQuestionService {

    private final BuyingQuestionRepository buyingQuestionRepository;
    @Autowired
    public BuyingQuestionServiceImpl(BuyingQuestionRepository buyingQuestionRepository) {
        this.buyingQuestionRepository = buyingQuestionRepository;
    };

    @Override
    public List<BuyingQuestion> getAllBuyingQuestions() {
        return buyingQuestionRepository.findAll();
    }

    @Override
    public void saveBuyingQuestion(BuyingQuestion question) {
        buyingQuestionRepository.save(question);
    }
}
