package com.why.principle;

/**
 * 方案2分析
 * 遵守了单一职责原则
 * 但是这样做改进很大，分了很多类，同时修改了客户端
 * 改进：直接修改vehicle类，改动得代码比较少
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"公路运行");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"天空运行");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"水中运行");
    }
}
