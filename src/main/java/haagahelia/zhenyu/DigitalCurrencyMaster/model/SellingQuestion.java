package haagahelia.zhenyu.DigitalCurrencyMaster.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class SellingQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String cyberName;
    private float soldPrice;
    private String newsStatus;
    private float resistancePrice;
    private String rsiData;
    private String result;

    private String dateTime;



    public SellingQuestion() {
    }

    public SellingQuestion(int id,String cyberName, float soldPrice, String newsStatus, float resistancePrice, String rsiData, String result, String dateTime) {
        this.id = id;
        this.cyberName = cyberName;
        this.soldPrice = soldPrice;
        this.newsStatus = newsStatus;
        this.resistancePrice = resistancePrice;
        this.rsiData = rsiData;
        this.result = result;
        this.dateTime = dateTime;

    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCyberName() {
        return cyberName;
    }

    public void setCyberName(String cyberName) {
        this.cyberName = cyberName;
    }

    public float getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(float soldPrice) {
        this.soldPrice = soldPrice;
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

    public String getRsiData() {
        return rsiData;
    }

    public void setRsiData(String rsiData) {
        this.rsiData = rsiData;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }


}
