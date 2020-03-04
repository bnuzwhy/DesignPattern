package com.why.principle;

public class Segregation1 {

}

interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1{

    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    public void operation2() {
        System.out.println("B 实现了 operation1");
    }

    public void operation3() {
        System.out.println("B 实现了 operation1");
    }

    public void operation4() {
        System.out.println("B 实现了 operation1");
    }

    public void operation5() {
        System.out.println("B 实现了 operation1");
    }
}
//A类通过接口Interface1 依赖（使用）B类，但只会用到1，2，3方法
class A{
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }
    public void depend3(Interface1 i){
        i.operation3();
    }
}
class D implements Interface1{

    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    public void operation2() {
        System.out.println("D 实现了 operation1");
    }

    public void operation3() {
        System.out.println("D 实现了 operation1");
    }

    public void operation4() {
        System.out.println("D 实现了 operation1");
    }

    public void operation5() {
        System.out.println("D 实现了 operation1");
    }
}
//C类通过接口Interface1 依赖（使用）D类，但只会用到1，4，5方法
class C{
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation4();
    }
    public void depend3(Interface1 i){
        i.operation5();
    }
}