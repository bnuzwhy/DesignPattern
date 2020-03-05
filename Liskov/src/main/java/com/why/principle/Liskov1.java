package com.why.principle;

public class Liskov1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.fun1(11, 3));
        System.out.println("1-3="+a.fun1(1, 3));

        B b = new B();
        System.out.println("11-3="+b.fun1(11, 3));
        System.out.println("1-3="+b.fun1(1, 3));
        System.out.println("11-3="+b.fun2(11, 3));
    }
}

class A{
    public int fun1(int num1,int num2){
        return num1-num2;
    }
}

class B extends A{
    @Override
    public int fun1(int num1, int num2){
        return num1+num2;
    }
    public int fun2(int num1,int num2){
        return fun1(num1,num2)+9;
    }
}
