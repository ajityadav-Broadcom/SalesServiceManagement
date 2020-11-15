package com.Ajit.Modal;

import java.time.LocalDate;

public class Transactions extends Audit {
    private String storeId;
    private String city;
    private String state;
    private String itemName;
    private long quantity;
    LocalDate localDate;
    private double amount;

    public Transactions(String storeId, String city, String state, String itemName, long quantity, LocalDate localDate, double amount) {
        this.storeId = storeId;
        this.city = city;
        this.state = state;
        this.itemName = itemName;
        this.quantity = quantity;
        this.localDate = localDate;
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

    public LocalDate getLocalDate() {
        return localDate;
    }

    public long getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "storeId='" + storeId + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", localDate=" + localDate +
                ", amount=" + amount +
                '}';
    }
}
