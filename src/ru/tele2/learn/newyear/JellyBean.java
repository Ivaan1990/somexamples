package ru.tele2.learn.newyear;

public class JellyBean extends Sweet {
    public JellyBean(double weight, double price){
        super(weight, price);
    }

    @Override
    public String toString(){
        return "Мармелад";
    }
}
