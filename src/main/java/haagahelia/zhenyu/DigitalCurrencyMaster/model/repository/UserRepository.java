package haagahelia.zhenyu.DigitalCurrencyMaster.model.repository;

import haagahelia.zhenyu.DigitalCurrencyMaster.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
    boolean existsByUsername(String username);

    User findByEmail(String email);

}
