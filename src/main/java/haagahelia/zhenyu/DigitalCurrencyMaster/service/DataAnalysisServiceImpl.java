package haagahelia.zhenyu.DigitalCurrencyMaster.service;


import haagahelia.zhenyu.DigitalCurrencyMaster.model.DataAnalysis;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.repository.DataAnalysisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataAnalysisServiceImpl implements DataAnalysisService {

    @Autowired
    private DataAnalysisRepository dataAnalysisRepository;

    @Override
    public List<DataAnalysis> getAllDataAnalysis() {
        return dataAnalysisRepository.findAll();
    }

    @Override
    public void saveDataAnalysis(DataAnalysis analysis) {
        dataAnalysisRepository.save(analysis);
    }
}
