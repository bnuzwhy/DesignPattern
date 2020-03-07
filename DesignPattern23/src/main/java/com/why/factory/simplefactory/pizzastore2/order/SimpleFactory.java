package com.why.factory.simplefactory.pizzastore2.order;

import com.why.factory.simplefactory.pizzastore2.pizza.CheesePizza;
import com.why.factory.simplefactory.pizzastore2.pizza.GreekPizza;
import com.why.factory.simplefactory.pizzastore2.pizza.PapperPizza;
import com.why.factory.simplefactory.pizzastore2.pizza.Pizza;

//简单工厂类
public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;

        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("GreekPizza");
        } else if (orderType.equals("chees")) {
            pizza = new CheesePizza();
            pizza.setName("CheesPizza");
        } else if(orderType.equals("papper")){
            pizza = new PapperPizza();
            pizza.setName("PapperPizza");
        }
        return pizza;
    }
    public static Pizza createPizza2(String orderType) {
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;

        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("GreekPizza");
        } else if (orderType.equals("chees")) {
            pizza = new CheesePizza();
            pizza.setName("CheesPizza");
        } else if(orderType.equals("papper")){
            pizza = new PapperPizza();
            pizza.setName("PapperPizza");
        }
        return pizza;
    }
}
