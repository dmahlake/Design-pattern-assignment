package com.design.pattern.factory;

public class ImplementFactory {

    public static void main(String[] args) {

        CoffeeFactory factory = new CoffeeFactory();

        factory.getCoffee(1);
    }
}
