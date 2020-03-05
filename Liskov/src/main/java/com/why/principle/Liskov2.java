package com.why.principle;

public class Liskov2 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        System.out.println("11-3="+a1.func1(11,3));
        System.out.println("1-8="+a1.func1(1,8));
        System.out.println("============");
        B1 b1 = new B1();
        System.out.println("11+3="+b1.func1(11,3));
        System.out.println("1-8="+b1.func3(1,8));
        System.out.println("11+3+9="+b1.func2(11,3));
    }
}

//创建一个更加基础的基础类
class Base{
    //把更加基础的方法和成员写到Base类
}

class A1 extends Base{
    public int func1(int num1,int num2){
        return num1-num2;
    }
}

class B1 extends Base{
    private A1 a = new A1();
    public int func1(int a,int b){
        return a+b;
    }
    public int func2(int a,int b){
        return func1(a,b)+9;
    }
    public int func3(int a,int b){
        return this.a.func1(a,b);
    }
}