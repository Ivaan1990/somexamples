package ru.tele2.learn.newyear;

import java.util.function.Predicate;

public class WeightFilter50 implements Predicate<Sweet> {
    @Override
    public boolean test(Sweet sweet) {
        return sweet.getPrice()>50;
    }
}
