package com.Ajit.service;

import com.Ajit.Modal.Command;
import com.Ajit.Modal.Store;
import com.Ajit.Modal.Transactions;
import com.Ajit.excpetion.InsufficientResourcesException;
import com.Ajit.excpetion.NoSuchItemPresentInStore;
import com.Ajit.excpetion.NoSuchStorePresent;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;
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
    private static SalesService _instance;

    private SalesService(TransactionService transactionService) {
        this.storeMap = new HashMap<>();
        this.transactionService = transactionService;
    }

    public static synchronized SalesService getInstance(TransactionService transactionService) {
        if (_instance == null) {
            _instance = new SalesService(transactionService);
        }
        return _instance;
    }

    public String addStore(Store store) {
        storeMap.put(store.getId(), store);
        return store.getId();
    }


    public void addItem(String storeId, String item, long quantity) {
        return;
    }

    public void sellItem(final String storeId, String item, long quantity) throws NoSuchItemPresentInStore, InsufficientResourcesException {
        if (!storeMap.containsKey(storeId)) {
            throw new NoSuchStorePresent("store with storeId" + storeId + " does not present in our database");
        }
        Store store = storeMap.get(storeId);
        store.sellItem(item, quantity);
        transactionService.addTransaction(new Transactions(storeId, store.getAddress().getCity(), store.getAddress().getState(), item, quantity, LocalDate.now(), 53));
    }

    public Map<String, Long> stockLeftInStore(final String storeId) {
        if (!storeMap.containsKey(storeId)) {
            throw new NoSuchStorePresent("store with storeId " + storeId + " does not present in our database");
        }
        Store store = storeMap.get(storeId);
        return store.getInventory();
    }

    public Map<String, Map<String, Long>> getDailySalesReport(String query) {
        Command command = new Command(query);
        if (!command.getValue().isEmpty()) {
            return getSalesByValue(command);
        } else {
            return getSalesByKey(command);
        }
    }

    private Map<String, Map<String, Long>> getSalesByKey(Command command) {
        System.out.println(command.getKey());
        if (command.getKey().equalsIgnoreCase("city")) {
            return transactionService.getDailyCitySales();
        } else if (command.getKey().equalsIgnoreCase("state")) {
            return transactionService.getDailyStateSales();
        } else if (command.getKey().equalsIgnoreCase("all")) {
            return transactionService.getDailyCitySales();
        }
        return null;
    }

    private Map<String, Map<String, Long>> getSalesByValue(Command command) {
        return null;
    }

    public Map<String, Long> getMonthlyItemSales(String query) {
        YearMonth yearMonth = YearMonth.now();
        return getMonthlyItemSales(query, yearMonth);
    }

    public Map<String, Long> getMonthlyItemSales(String query, YearMonth yearMonth) {
        return transactionService.getMonthlySalesOfItem(query, yearMonth);
    }
}
