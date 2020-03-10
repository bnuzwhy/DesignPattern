package com.why.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }
    @Override
    public int output5V() {
        //获取到220伏的电压
        int src = voltage220V.voltage220();
        int dstV = src/44;
        System.out.println("转成5伏");
        return dstV;
    }
}
