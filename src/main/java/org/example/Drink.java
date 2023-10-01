package org.example;

public class Drink extends Product {

    //Новое свойство volume - объем напитка

    protected float volume;

    public Drink(String name, int price, float volume) {
        super(name, price);
        this.volume = volume;
    }

    //Укажем геттер для volume

    public float getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return ".".repeat(10) + "Drink info" + ".".repeat(10) + "\n" +
                "Name: " + name + "\n" +
                "Volume: " + volume + "\n" +
                "Price: " + price + "\n";
    }
}
