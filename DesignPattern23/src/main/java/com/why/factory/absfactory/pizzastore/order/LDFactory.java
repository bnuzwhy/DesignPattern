package com.why.factory.absfactory.pizzastore.order;

import com.why.factory.absfactory.pizzastore.pizza.*;

//这是一个工厂子类
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式-伦敦工厂");
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
