package org.example;

public class Motorcycle extends Veichle{
    public Motorcycle(String type, Boolean taxClas) {
        super(type, taxClas);
    }

    public Motorcycle() {
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }

    @Override
    public Boolean getTaxClas() {
        return true;
    }
}
