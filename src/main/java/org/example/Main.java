package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //"Загрузим" продукты в наш автомат
        HotDrink coffee = new HotDrink("Coffee", 0.2f, 200, 50);
        HotDrink cacao = new HotDrink("Cacao", 0.2f, 250, 50);
        HotDrink tea = new HotDrink("Hot Tea", 0.3f, 200, 70);

        List<HotDrink> drinksList = new ArrayList<>(List.of(coffee,cacao,tea));

        HotDrinksSB machine = new HotDrinksSB();
        machine.initProducts(drinksList);
        //Укажем продукт, который есть в нашем списке, чтобы проверить работу автомата
        machine.getProduct("Coffee", 0.2f, 50);
        //Укажем продукт, которого нет в нашем списке,
        //чтобы получить соответствующее сообщение об отсутствии в консоли
        machine.getProduct("Coffee", 0.25f, 100);
    }
}