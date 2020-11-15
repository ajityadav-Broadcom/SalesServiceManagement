package com.Ajit;

import com.Ajit.Modal.Address;
import com.Ajit.Modal.Store;
import com.Ajit.excpetion.InsufficientResourcesException;
import com.Ajit.excpetion.NoSuchItemPresentInStore;
import com.Ajit.factory.ObjectFactory;
import com.Ajit.service.SalesService;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        SalesService salesService = ObjectFactory.getSalesServiceInstance();

        Store store = new Store("kt", new Address("Mumbai", "Maharashtra", "India", "chorBajar"));
        Store store1 = new Store("ktfe", new Address("Mumbai", "Maharashtra", "India", "chorBajar"));
        Store store2 = new Store("kfn", new Address("Pune", "Maharashtra", "India", "cho"));
        Store store3 = new Store("kfkfrnfi", new Address("Pune", "Maharashtra", "India", "MagarPata"));
        Store store4 = new Store("kkfrinf", new Address("Pune", "Maharashtra", "India", "chorBajar"));
        Store store5 = new Store("ktfkrfk", new Address("Mumbai", "Maharashtra", "India", "chorBajar"));
        Store store6 = new Store("kfrkfkrn", new Address("Delhi", "Maharashtra", "India", "chorBajar"));
        Store store7 = new Store("kkfkrn", new Address("Mumbai", "Maharashtra", "India", "chorBajar"));
        Store store8 = new Store("ktkrrn", new Address("Mumbai", "Maharashtra", "India", "chorBajar"));
        Store store9 = new Store("ktkrfrni", new Address("Mumbai", "Maharashtra", "India", "chorBajar"));
        Store store10 = new Store("ktkrneni", new Address("Mumbai", "Maharashtra", "India", "chorBajar"));
        Store store11 = new Store("ktkrfirn", new Address("Mumbai", "Maharashtra", "India", "chorBajar"));
        Store store12 = new Store("kfrrint", new Address("Mumbai", "Maharashtra", "India", "chorBajar"));
        Store store13 = new Store("ktrorin", new Address("Mumbai", "Maharashtra", "India", "chorBajar"));

        String id = null;
        try {
            id = salesService.addStore(store);
            System.out.println(id);
            try {
                salesService.sellItem(id, "Poha", 15);
                salesService.sellItem(id, "Tea", 13);
                salesService.sellItem(id, "Sandwich", 15);
                salesService.sellItem(id, "Burger", 3);
                salesService.sellItem(id, "Coffee", 4);
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
            id = salesService.addStore(store1);
            System.out.println(id);
            try {

                salesService.sellItem(id, "Poha", 5);
                salesService.sellItem(id, "Tea", 3);
                salesService.sellItem(id, "Sandwich", 5);
                salesService.sellItem(id, "Burger", 23);
                salesService.sellItem(id, "Coffee", 5);
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
            id = salesService.addStore(store2);
            System.out.println(id);
            try {
                salesService.sellItem(id, "Poha", 7);
                salesService.sellItem(id, "Tea", 2);
                salesService.sellItem(id, "Sandwich", 4);
                salesService.sellItem(id, "Burger", 2);
                salesService.sellItem(id, "Coffee", 14);
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
            id = salesService.addStore(store3);
            System.out.println(id);
            try {
                salesService.sellItem(id, "Poha", 15);
                salesService.sellItem(id, "Tea", 13);
                salesService.sellItem(id, "Sandwich", 15);
                salesService.sellItem(id, "Burger", 13);
                salesService.sellItem(id, "Coffee", 14);
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
            id = salesService.addStore(store4);
            System.out.println(id);
            try {
                salesService.sellItem(id, "Poha", 5);
                salesService.sellItem(id, "Tea", 3);
                salesService.sellItem(id, "Sandwich", 5);
                salesService.sellItem(id, "Burger", 3);
                salesService.sellItem(id, "Coffee", 4);
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
            id = salesService.addStore(store5);
            System.out.println(id);
            try {
                salesService.sellItem(id, "Poha", 5);
                salesService.sellItem(id, "Tea", 3);
                salesService.sellItem(id, "Sandwich", 5);
                salesService.sellItem(id, "Burger", 3);
                salesService.sellItem(id, "Coffee", 4);
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
            id = salesService.addStore(store6);
            System.out.println(id);
            try {
                salesService.sellItem(id, "Poha", 5);
                salesService.sellItem(id, "Tea", 3);
                salesService.sellItem(id, "Sandwich", 5);
                salesService.sellItem(id, "Burger", 14);
                salesService.sellItem(id, "Coffee", 4);
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
            id = salesService.addStore(store7);
            System.out.println(id);
            try {
                salesService.sellItem(id, "Poha", 5);
                salesService.sellItem(id, "Tea", 23);
                salesService.sellItem(id, "Sandwich", 5);
                salesService.sellItem(id, "Burger", 3);
                salesService.sellItem(id, "Coffee", 4);
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
            id = salesService.addStore(store8);
            System.out.println(id);
            try {
                salesService.sellItem(id, "Poha", 5);
                salesService.sellItem(id, "Tea", 3);
                salesService.sellItem(id, "Sandwich", 6);
                salesService.sellItem(id, "Burger", 3);
                salesService.sellItem(id, "Coffee", 4);
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
            id = salesService.addStore(store9);
            System.out.println(id);
            try {
                salesService.sellItem(id, "Poha", 5);
                salesService.sellItem(id, "Tea", 9);
                salesService.sellItem(id, "Sandwich", 2);
                salesService.sellItem(id, "Burger", 3);
                salesService.sellItem(id, "Coffee", 4);
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
            id = salesService.addStore(store10);
            System.out.println(id);
            try {
                salesService.sellItem(id, "Poha", 2);
                salesService.sellItem(id, "Tea", 5);
                salesService.sellItem(id, "Sandwich", 7);
                salesService.sellItem(id, "Burger", 4);
                salesService.sellItem(id, "Coffee", 2);
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
            id = salesService.addStore(store11);
            System.out.println(id);
            try {
                salesService.sellItem(id, "Poha", 9);
                salesService.sellItem(id, "Tea", 2);
                salesService.sellItem(id, "Sandwich", 5);
                salesService.sellItem(id, "Burger", 1);
                salesService.sellItem(id, "Coffee", 6);
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
            id = salesService.addStore(store12);
            System.out.println(id);
            try {
                salesService.sellItem(id, "Poha", 25);
                salesService.sellItem(id, "Tea", 3);
                salesService.sellItem(id, "Sandwich", 15);
                salesService.sellItem(id, "Burger", 14);
                salesService.sellItem(id, "Coffee", 23);
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
            id = salesService.addStore(store13);
            System.out.println(id);
            try {
                salesService.sellItem(id, "Poha", 5);
                salesService.sellItem(id, "Tea", 13);
                salesService.sellItem(id, "Sandwich", 23);
                salesService.sellItem(id, "Burger", 15);
                salesService.sellItem(id, "Coffee", 35);
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
        } catch (NoSuchItemPresentInStore e) {
            e.printStackTrace();
        }

        Map<String, Map<String, Long>> sales = salesService.getDailySalesReport("city");

        for (String city : sales.keySet()) {
            System.out.println(city + " =>");
            Map<String, Long> itemSales = sales.get(city);
            for (String item : itemSales.keySet()) {
                System.out.println(item + " " + itemSales.get(item));
            }
            System.out.println("##################################################");
        }
        Map<String, Long> inventory = salesService.stockLeftInStore(id);
        for (String item : inventory.keySet()) {
            System.out.println(item + " " + inventory.get(item));
        }
        Map<String, Long> coffeeSalesInMonth = salesService.getMonthlyItemSales("Coffee");
        System.out.println(coffeeSalesInMonth.size());
        for (String item : coffeeSalesInMonth.keySet()) {
            System.out.println(item + " " + coffeeSalesInMonth.get(item));
        }
    }

}
