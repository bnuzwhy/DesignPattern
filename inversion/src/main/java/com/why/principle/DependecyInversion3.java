package com.why.principle;
public class DependecyInversion3 {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);
    }
}
//方式一：通过接口传递实现依赖
interface IOpenAndClose{
    void open(ITV tv);
}
interface ITV{
    void play();
}
class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("ChangHong电视，打开");
    }
}
class OpenAndClose implements IOpenAndClose{
    @Override
    public void open(ITV tv) {
        tv.play();
    }
}
