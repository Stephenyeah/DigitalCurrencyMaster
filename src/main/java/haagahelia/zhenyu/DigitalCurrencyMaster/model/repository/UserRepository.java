package haagahelia.zhenyu.DigitalCurrencyMaster.model.repository;

import haagahelia.zhenyu.DigitalCurrencyMaster.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository {
    User findByEmail(String email);
    void save(User user);
    void updatePassword(String email, String newPassword);
}
