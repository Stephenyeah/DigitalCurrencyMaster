package haagahelia.zhenyu.DigitalCurrencyMaster.model.repository;


import haagahelia.zhenyu.DigitalCurrencyMaster.model.DataAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataAnalysisRepository extends JpaRepository<DataAnalysis, Integer> {
    // Add custom methods if needed
}
