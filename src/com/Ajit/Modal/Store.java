package com.Ajit.Modal;

import com.Ajit.excpetion.InsufficientResourcesException;
import com.Ajit.excpetion.NoSuchItemPresentInStore;

import java.util.HashMap;
import java.util.Map;

public class Store {
    private String name;
    private Address address;
    private Map<String, Long> inventory;

    public Store(String name, Address address) {
        this.name = name;
        this.address = address;
        this.inventory = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Map<String, Long> getInventory() {
        return inventory;
    }

    public void sellItem(String item, long quantity) throws NoSuchItemPresentInStore, InsufficientResourcesException {
        if (!inventory.containsKey(item)) {
            throw new NoSuchItemPresentInStore(item + " is not present in store");
        }
        Long rem = inventory.get(item);
        if (rem - quantity < 0) {
            throw new InsufficientResourcesException("Insufficient item is present in the store");
        }
        updateItem(item, -quantity);
    }

    private void updateItem(String item, long quantity) {
        inventory.put(item, inventory.getOrDefault(item, (long) 0) + quantity);
    }

    public void addItem(String item, int quantity) {
        updateItem(item, quantity);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", inventory=" + inventory +
                '}';
    }
}
