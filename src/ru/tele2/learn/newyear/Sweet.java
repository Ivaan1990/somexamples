package ru.tele2.learn.newyear;

public abstract class Sweet {
    double price, weight;

    public Sweet(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }



}
