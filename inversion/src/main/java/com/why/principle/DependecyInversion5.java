package com.why.principle;
public class DependecyInversion5 {
    public static void main(String[] args) {
        ChangHong2 changHong = new ChangHong2();
        OpenAndClose2 openAndClose = new OpenAndClose2();
        openAndClose.setTv(changHong);
        openAndClose.open2();
    }
}
//方式2：通过setter传递实现依赖
interface IOpenAndClose2{ void open2();void setTv(ITV2 tv);
}
interface ITV2{ void play2();}
class ChangHong2 implements ITV2{
    @Override
    public void play2() {
        System.out.println("ChangHong电视，打开");
    }
}
class OpenAndClose2 implements IOpenAndClose2{
    private ITV2 tv;
    @Override
    public void open2() {
        tv.play2();
    }
    @Override
    public void setTv(ITV2 tv) {
        this.tv = tv;
    }
}
