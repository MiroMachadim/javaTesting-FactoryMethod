package model;

import interfaces.INotificar;

public class Push implements INotificar {
    @Override
    public void sendMessage(String sender,String msg) {
        System.out.printf("%s notificou: \n\t %s",sender,msg);
    }
}
