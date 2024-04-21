package haagahelia.zhenyu.DigitalCurrencyMaster.model.repository;

import haagahelia.zhenyu.DigitalCurrencyMaster.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User findByEmail(String email);
    void updatePassword(String email, String newPassword);
}
