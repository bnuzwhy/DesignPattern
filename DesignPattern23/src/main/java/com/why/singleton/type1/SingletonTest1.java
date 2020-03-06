package com.why.singleton.type1;

public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton == singleton2);
    }

}

/**
 * 饿汉式（静态常量）
 */
class Singleton{
    //1.构造器私有化，外部无法访问
    private Singleton(){}

    //2.本类内部创建对象实例
    private final static Singleton singleton = new Singleton();

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getSingleton(){
        return singleton;
    }
}
