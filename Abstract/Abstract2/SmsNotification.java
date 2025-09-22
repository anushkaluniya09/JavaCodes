package com.Abstract.Abstract2;

class SmsNotification extends Notification{
    void send(String  message){
        System.out.print("Sending SMS: " + message);
    }
}
