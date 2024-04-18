package haagahelia.zhenyu.DigitalCurrencyMaster.service;


import haagahelia.zhenyu.DigitalCurrencyMaster.model.User;


import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    void register(User user);
    void resetPassword(String email, String newPassword);
    User findByEmail(String email);
}
