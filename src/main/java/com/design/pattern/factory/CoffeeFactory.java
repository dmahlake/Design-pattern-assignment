package com.design.pattern.factory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoffeeFactory {

   public void getCoffee(int coffeeChoice )
   {
       switch (coffeeChoice)
       {
           case 1:
               new Americano().coffee();
               break;
           case 2:
               new Espresso().coffee();
               break;
           default:
               System.out.println("please try again");
       }
   }
}
