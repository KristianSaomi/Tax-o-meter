package org.example;

public class Main {
    public static void main(String[] args) {
        var carObject = new Car("Car", true);
        TaxCalculator calc = new TaxCalculator();
        var motorCycleObject = new Motorcycle("Motorcycle", true);
        calc.veichleType(motorCycleObject);
        calc.veichleType(carObject);


        //var ambulanceObject = new Ambulance("Ambulance", false);
        //calc.veichleType(ambulanceObject);
        //calc.veichleType(ambulanceObject);
    }

}