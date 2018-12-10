package ru.tele2.learn.newyear;

public class Choco extends Sweet {
    public Choco(double weight, double price){
        super(weight, price);
    }

   @Override
    public String toString(){
       return "Шоколадка";
   }

}
