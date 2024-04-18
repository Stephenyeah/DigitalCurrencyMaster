package haagahelia.zhenyu.DigitalCurrencyMaster.controller;


import haagahelia.zhenyu.DigitalCurrencyMaster.model.BuyingQuestion;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.DataAnalysis;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.SellingQuestion;
import haagahelia.zhenyu.DigitalCurrencyMaster.service.BuyingQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class QuestionController {

    @Autowired
    private BuyingQuestionService buyingQuestionService;

    @Autowired
    private SellingQuestionService sellingQuestionService;

    @Autowired
    private DataAnalysisService dataAnalysisService;s

    @GetMapping("/buying-questions")
    public String getBuyingQuestions(Model model) {
        List<BuyingQuestion> buyingQuestions = buyingQuestionService.getAllBuyingQuestions();
        model.addAttribute("buyingQuestions", buyingQuestions);
        return "buying_questions";
    }

    @GetMapping("/selling-questions")
    public String getSellingQuestions(Model model) {
        List<SellingQuestion> sellingQuestions = sellingQuestionService.getAllSellingQuestions();
        model.addAttribute("sellingQuestions", sellingQuestions);
        return "selling_questions";
    }

    @GetMapping("/data-analysis")
    public String getDataAnalysis(Model model) {
        List<DataAnalysis> dataAnalysisList = dataAnalysisService.getAllDataAnalysis();
        model.addAttribute("dataAnalysisList", dataAnalysisList);
        return "data_analysis";
    }
}
