package com.Abstract.Abstract2;

import java.awt.desktop.SystemEventListener;

class EmailNotification extends Notification{
    void send(String  message){
        System.out.print("Sending Email: " + message);
    }
}
