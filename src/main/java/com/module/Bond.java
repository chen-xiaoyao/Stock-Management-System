package com.module;

public class Bond{
    private String code;
    private String name;
    
    private double yesterdayClose;
    private double todayOpen;
    private double nowPrice;
    private double max;
    private double min;
    
    private int tradingNum;
    private int tradingVolume;
    
    public Bond(String code, String name, double nowPrice) {
        this.code = code;
        this.name = name;
        
        this.yesterdayClose = 0;
        this.todayOpen = 0;
        this.nowPrice = nowPrice;
        this.max = 0;
        this.min = 0;
        
        this.tradingNum = 0;
        this.tradingVolume = 0;
    }
    
    public Bond(String code, String name, double yesterdayClose, double todayOpen, double nowPrice, double max, double min, int tradingNum, int tradingVolume) {
        this.code = code;
        this.name = name;
        this.yesterdayClose = yesterdayClose;
        this.todayOpen = todayOpen;
        this.nowPrice = nowPrice;
        this.max = max;
        this.min = min;
        this.tradingNum = tradingNum;
        this.tradingVolume = tradingVolume;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getYesterdayClose() {
        return yesterdayClose;
    }
    
    public void setYesterdayClose(double yesterdayClose) {
        this.yesterdayClose = yesterdayClose;
    }
    
    public double getTodayOpen() {
        return todayOpen;
    }
    
    public void setTodayOpen(double todayOpen) {
        this.todayOpen = todayOpen;
    }
    
    public double getNowPrice() {
        return nowPrice;
    }
    
    public void setNowPrice(double nowPrice) {
        this.nowPrice = nowPrice;
    }
    
    public double getMax() {
        return max;
    }
    
    public void setMax(double max) {
        this.max = max;
    }
    
    public double getMin() {
        return min;
    }
    
    public void setMin(double min) {
        this.min = min;
    }
    
    public int getTradingNum() {
        return tradingNum;
    }
    
    public void setTradingNum(int tradingNum) {
        this.tradingNum = tradingNum;
    }
    
    public int getTradingVolume() {
        return tradingVolume;
    }
    
    public void setTradingVolume(int tradingVolume) {
        this.tradingVolume = tradingVolume;
    }
}