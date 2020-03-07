package com.why.singleton.type5;

public class SingletonTest5 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
        instance.sayOk();
    }
}
//使用枚举，可以实现单例，推荐使用
enum Singleton{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok");
    }
}
