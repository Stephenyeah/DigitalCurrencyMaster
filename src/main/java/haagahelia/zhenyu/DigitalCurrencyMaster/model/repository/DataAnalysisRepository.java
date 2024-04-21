package haagahelia.zhenyu.DigitalCurrencyMaster.model.repository;



import haagahelia.zhenyu.DigitalCurrencyMaster.model.BuyingQuestion;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.DataAnalysis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataAnalysisRepository extends CrudRepository<DataAnalysis, Long> {
    // Add custom methods if needed

    // Custom method to retrieve buyingQuestion, SellingQuestion, and winStatus
    List<DataAnalysis> findAll();
}
