package com.why.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获取到220伏的电压
        int src = voltage220();
        int dstV = src/44;
        System.out.println("转成5伏");
        return dstV;
    }
}
