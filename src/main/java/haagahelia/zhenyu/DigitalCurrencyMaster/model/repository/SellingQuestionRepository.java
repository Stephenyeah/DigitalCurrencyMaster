package haagahelia.zhenyu.DigitalCurrencyMaster.model.repository;


import haagahelia.zhenyu.DigitalCurrencyMaster.model.SellingQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellingQuestionRepository extends JpaRepository<SellingQuestion, Integer> {
    // Add custom methods if needed
}
