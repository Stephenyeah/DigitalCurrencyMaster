package haagahelia.zhenyu.DigitalCurrencyMaster.controller;



import haagahelia.zhenyu.DigitalCurrencyMaster.model.repository.DataAnalysisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class QuestionController {


    @Autowired
    private DataAnalysisRepository dataAnalysisRepository;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = { "/", "/DataAnalysis" })
    public String dataAnalysis(Model model) {
        model.addAttribute("buyingQuestion", dataAnalysisRepository.findAll());
        return "dataAnalysis";
    }




}
