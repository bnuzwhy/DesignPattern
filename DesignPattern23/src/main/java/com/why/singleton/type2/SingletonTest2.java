package com.why.singleton.type2;

public class SingletonTest2 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton == singleton2);
    }
}
/**
 * 饿汉式（静态代码块 ）
 * 这种单例模式可用，但是会造成内存浪费
 */
class Singleton{
    //1.构造器私有化，外部无法访问
    private Singleton(){}

    //2.本类内部创建对象实例
    private static Singleton singleton;
    
    static {
        singleton = new Singleton();
    }

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getSingleton(){
        return singleton;
    }
}