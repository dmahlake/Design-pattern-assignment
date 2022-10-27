package com.design.pattern.factory;

public class Espresso implements CoffeeMaker{


    @Override
    public void coffee() {
        System.out.println("Espresso with : ");
        System.out.println(CoffeeIngredients.WHOLE_COFFEE_BEAN + "\n" + CoffeeIngredients.HOT_MILK
        + "\n" + CoffeeIngredients.BROWN_SUGAR);
    }
}
