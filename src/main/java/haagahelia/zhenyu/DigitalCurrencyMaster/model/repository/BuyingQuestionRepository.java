package haagahelia.zhenyu.DigitalCurrencyMaster.model.repository;


import haagahelia.zhenyu.DigitalCurrencyMaster.model.BuyingQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BuyingQuestionRepository extends CrudRepository<BuyingQuestion, Long> {
    // Add custom methods if needed
    List<BuyingQuestion> findBydateTime(String dateTime);

    List<BuyingQuestion> findAll();


}
