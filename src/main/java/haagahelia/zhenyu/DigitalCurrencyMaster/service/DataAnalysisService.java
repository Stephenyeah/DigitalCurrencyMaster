package haagahelia.zhenyu.DigitalCurrencyMaster.service;



import haagahelia.zhenyu.DigitalCurrencyMaster.model.DataAnalysis;

import java.util.List;

public interface DataAnalysisService {
    List<DataAnalysis> getAllDataAnalysis();
    void saveDataAnalysis(DataAnalysis analysis);
    // Add more methods if needed


}
