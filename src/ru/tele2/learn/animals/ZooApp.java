package ru.tele2.learn.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class ZooApp {
    public static void main(String[] args) {
        List<Cat> list = new ArrayList<>();
        list.add(new Cat("Маруся", 2));
        list.add(new Cat("Василий", 7));
        list.add(new Cat("Буся", 3));
        list.add(new Cat("Гав", 1));
        list.add(new Cat("Михаил", 10));
    }
}
