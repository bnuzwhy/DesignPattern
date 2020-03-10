package com.why.adapter.objectadapter;

public class Phone {

    //充电
    public void chargin(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("可以开始充电了");
        }else{
            System.out.println("电压过高无法充电");
        }
    }
}
