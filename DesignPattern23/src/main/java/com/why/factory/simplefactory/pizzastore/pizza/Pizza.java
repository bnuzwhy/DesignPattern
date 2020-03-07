package com.why.factory.simplefactory.pizzastore.pizza;

//抽象方法
public abstract class Pizza {
    //披萨的名字
    protected String name;

    //准备原材料，不同的披萨原材料是不一样的，因此我们做成抽象方法
    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking;");
    }

    public void cut(){
        System.out.println(name + " cutting;");
    }

    public void box(){
        System.out.println(name + " boxing;");
    }

    public void setName(String name){
        this.name = name;
    }
}
