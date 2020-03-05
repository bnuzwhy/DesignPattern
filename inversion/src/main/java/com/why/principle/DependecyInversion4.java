package com.why.principle;
public class DependecyInversion4 {
    public static void main(String[] args) {
        ChangHong1 changHong = new ChangHong1();
        OpenAndClose1 openAndClose = new OpenAndClose1(changHong);
        openAndClose.open1();
    }
}
//方式一：通过构造器传递实现依赖
interface IOpenAndClose1{ void open1();}
interface ITV1{ void play1();}
class ChangHong1 implements ITV1{
    @Override
    public void play1() {
        System.out.println("ChangHong电视，打开");
    }
}
class OpenAndClose1 implements IOpenAndClose1{
    private ITV1 tv;
    public OpenAndClose1(ITV1 tv){
        this.tv = tv;
    }
    @Override
    public void open1() {
        tv.play1();
    }
}
