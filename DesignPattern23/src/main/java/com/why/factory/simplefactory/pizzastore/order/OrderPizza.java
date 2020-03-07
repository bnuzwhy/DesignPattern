package com.why.factory.simplefactory.pizzastore.order;

import com.why.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.why.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.why.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza(){
        Pizza pizza = null;
        String orderType;//订购披萨类型

        do{
            orderType = getType();
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("GreekPizza");
            }else if(orderType.equals("chees")){
                pizza = new CheesePizza();
                pizza.setName("CheesPizza");
            }else{
                break;
            }

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    //写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type");
        String str = null;
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
