package com.why.factory.factorymethod.pizzastore.order;

import com.why.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    public OrderPizza(){
        Pizza pizza = null;
        String orderType;//订购披萨类型

        do{
            orderType = getType();
            //抽象方法，由工厂子类完成
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }
    //定义一个抽象方法，createPizza，让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

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
