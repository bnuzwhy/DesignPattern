package com.why.factory.simplefactory.pizzastore2.pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备Cheese");
    }
}
