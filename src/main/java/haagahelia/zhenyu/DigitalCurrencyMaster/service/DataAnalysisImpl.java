package haagahelia.zhenyu.DigitalCurrencyMaster.service;

import haagahelia.zhenyu.DigitalCurrencyMaster.model.BuyingQuestion;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.SellingQuestion;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.repository.BuyingQuestionRepository;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.repository.SellingQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataAnalysisImpl implements DataAnalysis {

    @Autowired
    private BuyingQuestionRepository buyingQuestionRepository;

    @Autowired
    private SellingQuestionRepository sellingQuestionRepository;

    @Override
    public List<BuyingQuestion> getAllBuyingQuestions() {
        return buyingQuestionRepository.findAll();
    }

    @Override
    public List<SellingQuestion> getAllSellingQuestions() {
        return sellingQuestionRepository.findAll();
    }
}
