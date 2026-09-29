package model;

import interfaces.INotificar;

public class FactorySMS extends FactoryNotificar{
    @Override
    public INotificar create(){
        return new SMS();
    }
}
