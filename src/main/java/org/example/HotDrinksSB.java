package org.example;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksSB implements SellBot<HotDrink> {

    private List<HotDrink> hotDrinkList = new ArrayList<>();

    @Override
    public void initProducts(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
        getProductsList();
    }

    public void getProductsList() {
        System.out.println(" ".repeat(4) + ">".repeat(10) + " Hot Drinks List " + "<".repeat(10));
        System.out.println("| Name |" + "\t" + "| Volume |" + "   | Price |" + "   | Temp |");
        for (HotDrink hotDrink : hotDrinkList) {
            System.out.printf("%s\t\t\t%s\t\t\t%s\t\t\t%s\n", hotDrink.getName(), hotDrink.getVolume(), hotDrink.getPrice(), hotDrink.getTemp());
        }
    }

    @Override
    public void printProduct(String name) {
        for (HotDrink hotDrink : hotDrinkList) {
            if (hotDrink.getName().equalsIgnoreCase(name)) {
                System.out.println(hotDrink);
            }
        }
    }

    public void getProduct(String name, float volume, int temp) {
        int count = 0;
        for (HotDrink hotDrink : hotDrinkList) {
            if (hotDrink.getName().equalsIgnoreCase(name) &&
                    hotDrink.getVolume() == volume &&
                    hotDrink.getTemp() == temp) {
                System.out.println(hotDrink);
                count++;
            }
        }


        System.out.print((count == 0) ? ("Product " + name + " with vol " + volume + " and temp " + temp + " not found") : "");
    }
}
