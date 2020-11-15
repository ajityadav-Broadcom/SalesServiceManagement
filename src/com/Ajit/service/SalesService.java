package com.Ajit.service;

import com.Ajit.Modal.Store;

import java.util.HashMap;
import java.util.Map;

/*
Questions that the system needs to answer are as given below. Please add test cases for those.
1. How much are the daily sales at a particular store, in a city, state and all over
2. What are the monthly sales for Coffee at store, in city, state and all over
3. How much is the stock left at a particular store at any given point in time
4. Which state is highest in beverage consumption in monthly category
5. Which cities currently have a shortage of snacks
6. how much stock left in store
7. Number of units sold at a given store
8. addition of various item in invintory of store.
 */
public class SalesService {
    private Map<String, Store> storeMap;
    private TransactionService transactionService;

    public SalesService(TransactionService transactionService) {
        this.storeMap = new HashMap<>();
        this.transactionService = transactionService;
    }

    public void addItem(String storeId, String item, long quantity) {
        return;
    }

    public void sellItem(final String storeId, String item, long quantity) {

    }

    public Map<String, Integer> stockLeftInStore(final String storeId) {
        return null;
    }

    public Map<String, Integer> getDailySalesReport(String query) {
        return null;
    }

    public Map<String, Integer> getMonthlyItemSales(String query) {
        return null;
    }
}
