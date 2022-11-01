package org.example;

import java.text.NumberFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TaxCalculator {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm");

    public Double veichleType(Veichle veichle)   {
        double price;
        Boolean tax;
        try {
            if (!(veichle instanceof Car
                    || veichle instanceof Ambulance
                    || veichle instanceof Motorcycle)) {
                System.out.println("Sorry not a valid Veichle");
                price = 0;
                return price;
            }
        }catch (Exception e) {
            System.out.println("Not a valid Veichle" + e);
        }
            tax = veichle.getTaxClas();
            price = calculatePrice(tax);
            printMethod(price);
            return price;
    }

    private void printMethod(double price) {
        NumberFormat.getCurrencyInstance().format(price);
        System.out.println("Fee is: ");
        System.out.println(NumberFormat.getCurrencyInstance().format(price));
        System.out.println("---------- ");
    }

    private double calculatePrice(boolean tax) {
        LocalTime today = LocalTime.now();
        String timeString = today.format(formatter);
        var newTime = Double.parseDouble(timeString);
        System.out.println("Local time passed the taxometer is: ");
        System.out.println(newTime);
        System.out.println("----------");

        if (tax == true) {
            var cost = compareTime(newTime);
            return cost;
        }
        return 0;
    }

    private double compareTime(double hour) {
        if (hour >= 24.00 && hour <= 06.00) return 20.00;
        else if (hour > 06.00 && hour <= 12.00) return 30.00;
        else if (hour > 12.00 && hour <= 18.00) return 40.00;
        else if (hour > 18.00) return 30.00;
        return 0;
    }
}
