package org.example;

public class Car extends Veichle {

    public Car(String type, Boolean taxClas) {
        super(type, taxClas);
    }

    public Car() {

    }

    @Override
    public String getType() {
        return "Car";
    }

    @Override
    public Boolean getTaxClas() {
        return true;
    }

}
