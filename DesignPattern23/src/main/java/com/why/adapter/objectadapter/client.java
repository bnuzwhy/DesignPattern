package com.why.adapter.objectadapter;

public class client {
    public static void main(String[] args) {
        System.out.println("===对象适配器模式===");
        Phone phone = new Phone();
        phone.chargin(new VoltageAdapter(new Voltage220V()));
    }
}
