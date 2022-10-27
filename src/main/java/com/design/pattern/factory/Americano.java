package com.design.pattern.factory;

public class Americano implements CoffeeMaker {

    @Override
    public void coffee() {

        System.out.println("Americano with : ");
        System.out.println(CoffeeIngredients.WHOLE_COFFEE_BEAN + "\n" + CoffeeIngredients.WHILE_SUGAR + "\n" +
                CoffeeIngredients.CINNAMON_SYRUP + "\n" + CoffeeIngredients.HOT_MILK + "\n" + CoffeeIngredients.CREAM);
    }
}
