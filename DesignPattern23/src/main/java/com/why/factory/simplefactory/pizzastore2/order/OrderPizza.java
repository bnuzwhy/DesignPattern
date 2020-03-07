package com.why.factory.simplefactory.pizzastore2.order;

import com.why.factory.simplefactory.pizzastore2.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";
        //设置一个简单工厂对象
        this.simpleFactory = simpleFactory;

        do{
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("预定失败");
                break;
            }
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
