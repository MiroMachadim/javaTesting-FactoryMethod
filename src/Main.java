import interfaces.INotificar;
import model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    INotificar email = new FactoryEmail().create();
    email.sendMessage("123@gmail.com","bom dia!");
    INotificar sms = new FactorySMS().create();
    sms.sendMessage("32103445","boa tarde!");
    Push push = (Push) new FactoryPush().create();
    push.sendMessage("google","boa noite!");
}


