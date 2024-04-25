package haagahelia.zhenyu.DigitalCurrencyMaster.controller;

import haagahelia.zhenyu.DigitalCurrencyMaster.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ResetPasswordController {

    @RequestMapping(value="/reset_password")
    public String showForgetPasswordPage() {
        return "forget_password"; // Assuming "forget_password.html" is your forget password page
    }

    private final UserService userService;

    public ResetPasswordController(UserService userService) {
        this.userService = userService;
    }



    @PostMapping("/sendResetPasswordEmail")
    public ResponseEntity sendResetPasswordEmail(@RequestParam String emailAddress) {
        userService.sendResetPasswordEmail(emailAddress);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/resetPassword")
    public ResponseEntity resetPassword(@RequestParam String emailAddress, @RequestParam String verificationCode, @RequestParam String newPassword) {
        if (userService.validateVerificationCode(emailAddress, verificationCode)) {
            userService.resetPassword(emailAddress, newPassword);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}

