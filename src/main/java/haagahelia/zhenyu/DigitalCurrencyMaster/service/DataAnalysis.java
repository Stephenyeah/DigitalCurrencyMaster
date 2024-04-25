package haagahelia.zhenyu.DigitalCurrencyMaster.service;

import haagahelia.zhenyu.DigitalCurrencyMaster.model.BuyingQuestion;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.SellingQuestion;

import java.util.List;

public interface DataAnalysis {
    List<BuyingQuestion> getAllBuyingQuestions();
    List<SellingQuestion> getAllSellingQuestions();
}
