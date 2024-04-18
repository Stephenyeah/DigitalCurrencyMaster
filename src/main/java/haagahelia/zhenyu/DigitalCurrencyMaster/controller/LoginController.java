package haagahelia.zhenyu.DigitalCurrencyMaster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    // Implement other controller methods for registration, password reset, etc.
}
