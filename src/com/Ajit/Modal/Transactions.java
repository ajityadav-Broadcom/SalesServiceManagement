package com.Ajit.Modal;

public class Transactions extends Audit {
    private String storeId;
    private String city;
    private String state;
    private String itemName;
    private int date;
    private int month;
    private int year;
    private double amount;

    public Transactions(String storeId, String city, String state, String itemName, int date, int month, int year, double amount) {
        this.storeId = storeId;
        this.city = city;
        this.state = state;
        this.itemName = itemName;
        this.date = date;
        this.month = month;
        this.year = year;
        this.amount = amount;
    }

    public String getStoreId() {
        return storeId;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getItemName() {
        return itemName;
    }

    public double getAmount() {
        return amount;
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "storeId='" + storeId + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", itemName='" + itemName + '\'' +
                ", date=" + date +
                ", month=" + month +
                ", year=" + year +
                ", amount=" + amount +
                '}';
    }
}
