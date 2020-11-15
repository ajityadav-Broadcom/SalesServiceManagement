package com.Ajit.service;

import com.Ajit.Modal.Transactions;


import java.time.LocalDate;
import java.time.YearMonth;
import java.util.*;

public class TransactionService {
    private Map<LocalDate, List<Transactions>> dailySales;
    private Map<YearMonth, List<Transactions>> monthlySales;
    private static TransactionService _instance;

    private TransactionService() {
        this.dailySales = new HashMap<>();
        this.monthlySales = new HashMap<>();
    }

    public static synchronized TransactionService getInstance() {
        if (_instance == null) {
            _instance = new TransactionService();
        }
        return _instance;
    }

    public void addTransaction(Transactions transactions) {
        if (!dailySales.containsKey(transactions.getLocalDate())) {
            dailySales.put(transactions.getLocalDate(), new ArrayList<>());
        }
        dailySales.get(transactions.getLocalDate()).add(transactions);
        YearMonth yearMonth = YearMonth.of(transactions.getLocalDate().getYear(), transactions.getLocalDate().getMonth());
        if (!monthlySales.containsKey(yearMonth)) {
            monthlySales.put(yearMonth, new ArrayList<>());
        }
        monthlySales.get(yearMonth).add(transactions);
    }

    public List<Transactions> getDailySales() {
        LocalDate localDate = LocalDate.now();
        return getSpecificDaySales(localDate);
    }

    public List<Transactions> getSpecificDaySales(LocalDate localDate) {
        if (!dailySales.containsKey(localDate)) return new ArrayList<>();
        return dailySales.get(localDate);
    }

    public List<Transactions> getMonthlySales() {
        YearMonth Yearmonth = YearMonth.now();
        return getSpecificMonthSales(Yearmonth);
    }

    public List<Transactions> getSpecificMonthSales(YearMonth yearMonth) {
        if (!monthlySales.containsKey(yearMonth)) return new ArrayList<>();
        return monthlySales.get(yearMonth);
    }

    public Map<String, Map<String, Long>> getDailyStoreSales() {
        Map<String, Map<String, Long>> sales = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        List<Transactions> transactionsList = dailySales.get(calendar.DATE);
        transactionsList.forEach(e -> {
            if (sales.containsKey(e.getStoreId())) {
                sales.put(e.getStoreId(), new HashMap<>());
            }
            long previousSales = sales.get(e.getStoreId()).getOrDefault(e.getItemName(), (long) 0);
            sales.get(e.getStoreId()).put(e.getItemName(), previousSales + e.getQuantity());
        });
        return sales;
    }

    public Map<String, Map<String, Long>> getDailyStateSales() {
        Map<String, Map<String, Long>> sales = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        List<Transactions> transactionsList = dailySales.get(calendar.DATE);
        transactionsList.forEach(e -> {
            if (sales.containsKey(e.getState())) {
                sales.put(e.getStoreId(), new HashMap<>());
            }
            long previousSales = sales.get(e.getState()).getOrDefault(e.getItemName(), (long) 0);
            sales.get(e.getState()).put(e.getItemName(), previousSales + e.getQuantity());
        });
        return sales;
    }

    public Map<String, Map<String, Long>> getDailyCitySales() {
        Map<String, Map<String, Long>> sales = new HashMap<>();
        LocalDate localDate = LocalDate.now();
        List<Transactions> transactionsList = dailySales.get(localDate);
        transactionsList.forEach(e -> {
            if (!sales.containsKey(e.getCity())) {
                sales.put(e.getCity(), new HashMap<>());
            }
            sales.get(e.getCity()).putIfAbsent(e.getItemName(), (long) 0);
            long previousSales = sales.get(e.getCity()).getOrDefault(e.getItemName(), (long) 0);
            sales.get(e.getCity()).put(e.getItemName(), previousSales + e.getQuantity());
        });
        return sales;
    }

    public Map<String, Long> getDailyAllSales() {
        Map<String, Long> sales = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        List<Transactions> transactionsList = dailySales.get(calendar.DATE);
        transactionsList.forEach(e -> {
            sales.put(e.getItemName(), sales.getOrDefault(e.getItemName(), (long) 0) + e.getQuantity());
        });
        return sales;
    }

    public Map<String, Long> getMonthlySalesOfItem(String itemName, YearMonth yearMonth) {
        Map<String, Long> sales = new HashMap<>();
        List<Transactions> transactionsList = monthlySales.get(yearMonth);
        for (Transactions transactions : transactionsList) {
            if (transactions.getItemName().equalsIgnoreCase(itemName)) {
                sales.put(itemName, sales.getOrDefault(itemName, (long) 0) + transactions.getQuantity());
            }
        }
        return sales;
    }
}
