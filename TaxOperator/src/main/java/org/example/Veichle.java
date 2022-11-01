package org.example;

import java.util.Objects;

public abstract class Veichle {
    private String type;
    private Boolean taxClas;

    public Veichle(String type, Boolean taxClas) {
        this.type = type;
        this.taxClas = taxClas;
    }
    public Veichle(){

    }
    public abstract String getType();
    public abstract Boolean getTaxClas();


    @Override
    public String toString() {
        return "Veichle{" +
                "type='" + type + '\'' +
                ", taxClas=" + taxClas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veichle veichle = (Veichle) o;
        return type.equals(veichle.type) && taxClas.equals(veichle.taxClas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, taxClas);
    }
}
