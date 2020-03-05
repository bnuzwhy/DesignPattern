package com.why.principle;

public class Segregation2 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.depend1(new B1());
        a.depend2(new B1());
        a.depend3(new B1());

        C1 c = new C1();
        c.depend1(new D1());
        c.depend4(new D1());
        c.depend5(new D1());

    }
}

interface Interface11{
    void operation1();
}
interface Interface12{
    void operation2();
    void operation3();
}
interface Interface13{
    void operation4();
    void operation5();
}

class B1 implements Interface11, Interface12{

    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
}

class A1{
    public void depend1(Interface11 i){
        i.operation1();
    }
    public void depend2(Interface12 i){
        i.operation2();
    }
    public void depend3(Interface12 i){
        i.operation3();
    }
}


class D1 implements Interface11, Interface13{

    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

class C1{
    public void depend1(Interface11 i){
        i.operation1();
    }
    public void depend4(Interface13 i){
        i.operation4();
    }
    public void depend5(Interface13 i){
        i.operation5();
    }
}
