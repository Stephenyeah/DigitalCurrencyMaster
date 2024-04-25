package haagahelia.zhenyu.DigitalCurrencyMaster.model.repository;



import haagahelia.zhenyu.DigitalCurrencyMaster.model.BuyingQuestion;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.SellingQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SellingQuestionRepository extends CrudRepository<SellingQuestion, Long> {
    // Add custom methods if needed
//    List<SellingQuestion> findByUserId();
    List<SellingQuestion> findAll();
}
