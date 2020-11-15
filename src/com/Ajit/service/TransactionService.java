package com.Ajit.service;

import com.Ajit.Modal.Transactions;

import java.util.*;

public class TransactionService {
    private Map<Integer, List<Transactions>> dailySales;
    private Map<Integer, List<Transactions>> monthlySales;

    public TransactionService() {
        this.dailySales = new HashMap<>();
        this.monthlySales = new HashMap<>();
    }

    public void addTransaction(Transactions transactions) {
        if (!dailySales.containsKey(transactions.getDate())) {
            dailySales.put(transactions.getDate(), new ArrayList<>());
        }
        dailySales.get(transactions.getDate()).add(transactions);
        if (!monthlySales.containsKey(transactions.getMonth())) {
            monthlySales.put(transactions.getMonth(), new ArrayList<>());
        }
        monthlySales.get(transactions.getMonth()).add(transactions);
    }

    public List<Transactions> getDailySales() {
        Calendar calendar = Calendar.getInstance();
        return getSpecificDaySales(calendar.DATE);
    }

    public List<Transactions> getSpecificDaySales(int day) {
        if (!dailySales.containsKey(day)) return new ArrayList<>();
        return dailySales.get(day);
    }

    public List<Transactions> getMonthlySales() {
        Calendar calendar = Calendar.getInstance();
        return getSpecificMonthSales(calendar.MONTH);
    }

    public List<Transactions> getSpecificMonthSales(int month) {
        if (!monthlySales.containsKey(month)) return new ArrayList<>();
        return monthlySales.get(month);
    }
}
