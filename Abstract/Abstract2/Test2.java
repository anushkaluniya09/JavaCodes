package com.Abstract.Abstract2;

public class Test2 {
    public static void main(String[] args){
        Notification n1=new EmailNotification();
        Notification n2=new SmsNotification();
        n1.send("Welcome to java!");
        n1.send("Your OTP is 1235");
    }
}
