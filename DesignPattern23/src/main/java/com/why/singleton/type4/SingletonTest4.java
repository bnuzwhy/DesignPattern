package com.why.singleton.type4;

public class SingletonTest4 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton2);
    }
}

class Singleton{
    private volatile static Singleton singleton;

    private Singleton(){}

    //写一个静态内部类，该类中有一个静态的属性Singleton
    private static class SingletonInstance{
        private static final Singleton instance = new Singleton();
    }

    //提供一个静态的公有方法，当使用到该方法时才会创建singleton
    //即懒汉式
    public static synchronized Singleton getSingleton(){

        return SingletonInstance.instance;
    }
}
