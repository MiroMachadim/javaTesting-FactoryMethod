package model;

import interfaces.INotificar;

public class SMS implements INotificar {
    @Override
    public void sendMessage(String sender,String msg){
       System.out.printf("%s\n%s\n",sender,msg);
    }
}
