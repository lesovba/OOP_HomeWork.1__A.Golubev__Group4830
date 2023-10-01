package org.example;

public class Product {

//Пусть у продукта будет два поля - имя name и цена price
    String name;
    int price;

    @Override
    public String toString() {
        return "-".repeat(10) + "Product" + "-".repeat(10) +
                "Name: " + name + '\n' +
                "Price: " + price +'\n';
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
