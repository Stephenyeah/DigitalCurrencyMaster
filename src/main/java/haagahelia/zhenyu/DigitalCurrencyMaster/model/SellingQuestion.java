package haagahelia.zhenyu.DigitalCurrencyMaster.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SellingQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sellId;
    private float nowPrice;
    private String newsStatus;
    private float resistancePrice;
    private String bollingerBandsPosition;
    private String result;

    public SellingQuestion() {
    }

    public SellingQuestion(int sellId, float nowPrice, String newsStatus, float resistancePrice, String bollingerBandsPosition, String result) {
        this.sellId = sellId;
        this.nowPrice = nowPrice;
        this.newsStatus = newsStatus;
        this.resistancePrice = resistancePrice;
        this.bollingerBandsPosition = bollingerBandsPosition;
        this.result = result;
    }

    // Getters and setters

    public int getSellId() {
        return sellId;
    }

    public void setSellId(int sellId) {
        this.sellId = sellId;
    }

    public float getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(float nowPrice) {
        this.nowPrice = nowPrice;
    }

    public String getNewsStatus() {
        return newsStatus;
    }

    public void setNewsStatus(String newsStatus) {
        this.newsStatus = newsStatus;
    }

    public float getResistancePrice() {
        return resistancePrice;
    }

    public void setResistancePrice(float resistancePrice) {
        this.resistancePrice = resistancePrice;
    }

    public String getBollingerBandsPosition() {
        return bollingerBandsPosition;
    }

    public void setBollingerBandsPosition(String bollingerBandsPosition) {
        this.bollingerBandsPosition = bollingerBandsPosition;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
