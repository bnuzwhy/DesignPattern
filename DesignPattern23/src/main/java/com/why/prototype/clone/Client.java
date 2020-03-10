package com.why.prototype.clone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "松江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛","小牛");

        DeepProtoType p2 = (DeepProtoType) p.clone();
        System.out.println("p.name = "+p.name + "p.deepCloneableTarget = "+p.deepCloneableTarget.hashCode());
        System.out.println("p2.name = "+p2.name + "p2.deepCloneableTarget = "+p2.deepCloneableTarget.hashCode());
    }
}
