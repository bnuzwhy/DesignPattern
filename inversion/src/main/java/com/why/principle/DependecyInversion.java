package com.why.principle;

public class DependecyInversion {
    public static void main(String[] args) {
        new Person().receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息：hello,world";
    }
}

class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
