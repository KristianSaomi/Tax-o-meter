package org.example;

public class Ambulance extends Veichle{

    public Ambulance(String type, Boolean taxClas) {
        super(type, taxClas);
    }

    public Ambulance() {

    }

    @Override
    public String getType() {
        return "Ambulance";
    }

    @Override
    public Boolean getTaxClas() {
        return false;
    }
}
