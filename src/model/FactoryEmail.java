package model;

import interfaces.INotificar;

public class FactoryEmail extends FactoryNotificar {

    @Override
    public INotificar create() {
        return new Email();
    }
}
