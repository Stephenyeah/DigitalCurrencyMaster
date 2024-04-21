package haagahelia.zhenyu.DigitalCurrencyMaster.model.repository;


import haagahelia.zhenyu.DigitalCurrencyMaster.model.BuyingQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BuyingQuestionRepository extends JpaRepository<BuyingQuestion, Integer> {
    // Add custom methods if needed


}
