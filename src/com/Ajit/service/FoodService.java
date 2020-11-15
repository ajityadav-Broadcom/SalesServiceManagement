package com.Ajit.service;

import com.Ajit.excpetion.UnsupportedItem;

import java.util.HashMap;
import java.util.Map;

public class FoodService {
    Map<String, String> supportedFood;
    private static FoodService _instance;

    private FoodService() {
        this.supportedFood = new HashMap<>();
        supportedFood.put("Sandwich", "Food");
        supportedFood.put("Poha", "Food");
        supportedFood.put("Burger", "Food");
        supportedFood.put("Tea", "Beverages");
        supportedFood.put("Coffee", "Beverages");
        supportedFood.put("Bottled water", "Beverages");
    }

    public static synchronized FoodService getInstance() {
        if (_instance == null) {
            _instance = new FoodService();
        }
        return _instance;
    }

    public boolean isBeverages(String item) {
        if (supportedFood.containsKey(item)) {
            throw new UnsupportedItem(item + " unsupported item is passed");
        }
        return supportedFood.get(item).equals("Beverages");
    }

    public Map<String, String> getSupportedFood() {
        return supportedFood;
    }

    public String getItemType(String item) {
        if (supportedFood.containsKey(item)) {
            throw new UnsupportedItem(item + " Unsupported item is passed for process");
        }
        return supportedFood.get(item);
    }
}
