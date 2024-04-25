package haagahelia.zhenyu.DigitalCurrencyMaster.controller;



import haagahelia.zhenyu.DigitalCurrencyMaster.model.BuyingQuestion;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.SellingQuestion;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.repository.BuyingQuestionRepository;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.repository.SellingQuestionRepository;
import haagahelia.zhenyu.DigitalCurrencyMaster.service.DataAnalysis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class QuestionController {

    @Autowired
    private DataAnalysis dataAnalysis;
    @Autowired
    private BuyingQuestionRepository buyingQuestion;
    @Autowired
    private SellingQuestionRepository sellingQuestion;


    @RequestMapping("/login")
    public String login() {
        return "login";
    }


    @RequestMapping(value = {"/","/data_analysis"})
    public String questionlist(Model model){
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = user.getUsername();
        System.out.println("Hello: " + username);
        model.addAttribute("buyingquestions", buyingQuestion.findAll());
        model.addAttribute("sellingquestions", sellingQuestion.findAll());
        return "data_analysis";

    }


    @RequestMapping(value = "/buyingQuestion", method = RequestMethod.GET)
    public @ResponseBody List<BuyingQuestion> buyingQuestionsListRest() {
                return (List<BuyingQuestion>) buyingQuestion.findAll();
    }

    @RequestMapping(value = "/sellingQuestion", method = RequestMethod.GET)
    public @ResponseBody List<SellingQuestion> sellingQuestionsListRest() {
        return (List<SellingQuestion>) sellingQuestion.findAll();
    }


    // add a new buyquestion
    @RequestMapping(value = "/buying_question")
    public String addBuyingQuestion(Model model) {
        model.addAttribute("buyingquestions", new BuyingQuestion());

        return "buying_question";
    }

    @RequestMapping(value = "/saveBuy", method = RequestMethod.POST)
    public String save(BuyingQuestion buyingQuestion1) {
        buyingQuestion.save(buyingQuestion1);
        return "redirect:data_analysis";
    }

    // add a new sellquestion
    @RequestMapping(value = "/selling_question")
    public String addSellingQuestion(Model model) {
        model.addAttribute("sellingquestions", new SellingQuestion());

        return "selling_question";
    }

    @RequestMapping(value = "/saveSell", method = RequestMethod.POST)
    public String save(SellingQuestion sellingQuestion1) {
        sellingQuestion.save(sellingQuestion1);
        return "redirect:data_analysis";
    }

    // delete BUYQUESTION
    @PreAuthorize("hasAuthority('USER')")
    @RequestMapping(value = "/deleteBuy/{id}", method = RequestMethod.GET)
    public String deleteBuyingQuestion(@PathVariable("id") Long buyId, Model model) {
        buyingQuestion.deleteById(buyId);
        return "redirect:data_analysis";
    }

    // delete SellQUESTION
    @RequestMapping(value = "/deleteSell/{id}", method = RequestMethod.GET)
    public String deleteSellingQuestion(@PathVariable("id") Long sellId, Model model) {
        sellingQuestion.deleteById(sellId);
        return "redirect:data_analysis";
    }






}
