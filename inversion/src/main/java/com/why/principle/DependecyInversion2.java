package com.why.principle;

public class DependecyInversion2 {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.receive(new Email1());
        person2.receive(new Wechat());
    }
}

interface IReceiver{
    String getInfo();
}

class Email1 implements IReceiver{
    @Override
    public String getInfo(){
        return "电子邮件信息：hello,world";
    }
}

class Wechat implements IReceiver{

    @Override
    public String getInfo() {
        return "wechat邮件信息：hello,world";
    }
}

class Person2{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
