package com.why.factory.factorymethod.pizzastore.order;

import com.why.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.why.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.why.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.why.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDCheesePizza();
        }
        return pizza;
    }
}
