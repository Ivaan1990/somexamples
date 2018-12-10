package ru.tele2.learn.newyear;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BoxWithCandies {
    public List<Sweet> sweets = new ArrayList<>();

    Predicate<Sweet> shouldWeAddThisSweet;

    public BoxWithCandies(Predicate<Sweet> shouldWeAddThisSweet){
        this.shouldWeAddThisSweet = shouldWeAddThisSweet;
    }

    public void add(Sweet sweet) {
        if(shouldWeAddThisSweet.test(sweet)) {
            sweets.add(sweet);
        } else {
            System.out.println("Сладость не удовлетворяет политике коробки!");
        }
    }

    public void delete(int position) {
        sweets.remove(position);
    }

    public void printAll(){
        sweets.forEach(System.out::println);
    }

    public void printFiltered(Predicate<Sweet> howFilter){
        sweets.stream().filter(howFilter).forEach(System.out::println);
    }

    public void totalCost(Predicate<Sweet> howFilter){
        sweets.stream().filter(howFilter).forEach(System.out::println);
    }

}
