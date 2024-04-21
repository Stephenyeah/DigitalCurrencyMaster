package haagahelia.zhenyu.DigitalCurrencyMaster.service;



import haagahelia.zhenyu.DigitalCurrencyMaster.model.SellingQuestion;

import java.util.List;

public interface SellingQuestionService {
    List<SellingQuestion> getAllSellingQuestions();
    void saveSellingQuestion(SellingQuestion question);
    // Add more methods if needed
}
