package haagahelia.zhenyu.DigitalCurrencyMaster.service;



import haagahelia.zhenyu.DigitalCurrencyMaster.model.BuyingQuestion;

import java.util.List;

public interface BuyingQuestionService {
    List<BuyingQuestion> getAllBuyingQuestions();
    void saveBuyingQuestion(BuyingQuestion question);
    // Add more methods if needed
}
