package com.why.adapter.classadapter;

public class client {
    public static void main(String[] args) {
        System.out.println("===类适配器模式===");
        Phone phone = new Phone();
        phone.chargin(new VoltageAdapter());
    }
}
