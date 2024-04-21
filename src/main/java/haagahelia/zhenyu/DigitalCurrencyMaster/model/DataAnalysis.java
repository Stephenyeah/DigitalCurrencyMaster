package haagahelia.zhenyu.DigitalCurrencyMaster.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DataAnalysis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int analysisId;
    @ManyToOne
    private BuyingQuestion buyingQuestion;
    @ManyToOne
    private SellingQuestion sellingQuestion;
    private String winStatus;

    public DataAnalysis() {
    }

    public DataAnalysis(int analysisId, BuyingQuestion buyingQuestion, SellingQuestion sellingQuestion, String winStatus) {
        this.analysisId = analysisId;
        this.buyingQuestion = buyingQuestion;
        this.sellingQuestion = sellingQuestion;
        this.winStatus = winStatus;
    }

    // Getters and setters

    public int getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(int analysisId) {
        this.analysisId = analysisId;
    }

    public BuyingQuestion getBuyingQuestion() {
        return buyingQuestion;
    }

    public void setBuyingQuestion(BuyingQuestion buyingQuestion) {
        this.buyingQuestion = buyingQuestion;
    }

    public SellingQuestion getSellingQuestion() {
        return sellingQuestion;
    }

    public void setSellingQuestion(SellingQuestion sellingQuestion) {
        this.sellingQuestion = sellingQuestion;
    }

    public String getWinStatus() {
        return winStatus;
    }

    public void setWinStatus(String winStatus) {
        this.winStatus = winStatus;
    }
}
