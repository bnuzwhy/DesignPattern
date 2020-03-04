package com.why.principle;

/**
 * 违反了单一职责原则
 * 解决方案：根据交通工具运行得方式不同，分解成不同得类
 */
public class SingleResponsebility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上运行......");
    }
}
