package com.why.factory.simplefactory.pizzastore2.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备Greek");
    }
}
