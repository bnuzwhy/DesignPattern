package com.why.singleton.type3;

public class SingletonTest3 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton2);
    }
}

class Singleton{
    private volatile static Singleton singleton;

    private Singleton(){}

    //提供一个静态的公有方法，当使用到该方法时才会创建singleton
    //即懒汉式
    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
