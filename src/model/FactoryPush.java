package model;

import interfaces.INotificar;

public class FactoryPush extends FactoryNotificar{
    @Override
    public INotificar create() {
        return new Push();
    }
}
