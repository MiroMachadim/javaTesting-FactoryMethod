package model;

import interfaces.INotificar;

public class Email implements INotificar {
    String sender = "miromachado@gmail.com";

    @Override
    public void sendMessage(String sender,String msg) {
        System.out.printf("%s:%s\n",sender,msg);
    }
}
