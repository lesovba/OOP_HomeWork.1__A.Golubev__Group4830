package org.example;


    public class HotDrink extends Drink {

        //HotDrink - наследник Drink со полем температура, temp
        protected int temp;

        //Укажем getter для temp

        public int getTemp() {
            return temp;
        }

        public HotDrink(String name, float volume, int price, int temp) {
            super(name, price, volume);
            this.temp = temp;
        }

        @Override
        public String toString() {
            return ".".repeat(10) + "Drink info" + ".".repeat(10) + "\n" +
                    "Name: " + name + "\n" +
                    "Volume: " + volume + "\n" +
                    "Price: " + price + "\n" +
                    "Temp: " + temp + "\n";
        }

    }

