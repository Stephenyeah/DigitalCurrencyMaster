package haagahelia.zhenyu.DigitalCurrencyMaster.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BuyingQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private float nowPrice;
    private String newsStatus;
    private float supportPrice;
    private int rsiData;
    private String bollingerBandsPosition;

    private String dateTime;



    // Getters and setters

    public BuyingQuestion() {
    }

    public BuyingQuestion(long id, float nowPrice, String newsStatus, float supportPrice, int rsiData, String bollingerBandsPosition, String dateTime) {
        this.id = id;
        this.nowPrice = nowPrice;
        this.newsStatus = newsStatus;
        this.supportPrice = supportPrice;
        this.rsiData = rsiData;
        this.bollingerBandsPosition = bollingerBandsPosition;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public float getSupportPrice() {
        return supportPrice;
    }

    public void setSupportPrice(float supportPrice) {
        this.supportPrice = supportPrice;
    }

    public int getRsiData() {
        return rsiData;
    }

    public void setRsiData(int rsiData) {
        this.rsiData = rsiData;
    }

    public String getBollingerBandsPosition() {
        return bollingerBandsPosition;
    }

    public void setBollingerBandsPosition(String bollingerBandsPosition) {
        this.bollingerBandsPosition = bollingerBandsPosition;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
