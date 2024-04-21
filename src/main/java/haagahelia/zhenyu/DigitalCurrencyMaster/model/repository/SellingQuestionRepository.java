package haagahelia.zhenyu.DigitalCurrencyMaster.model.repository;


import haagahelia.zhenyu.DigitalCurrencyMaster.model.SellingQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SellingQuestionRepository extends JpaRepository<SellingQuestion, Integer> {
    // Add custom methods if needed
}
