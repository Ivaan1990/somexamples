package ru.tele2.learn;

import ru.tele2.learn.newyear.BoxWithCandies;
import ru.tele2.learn.newyear.Choco;
import ru.tele2.learn.newyear.JellyBean;

class App {
    public static void main(String[] args) {
       BoxWithCandies box = new BoxWithCandies(sweet -> sweet instanceof JellyBean && sweet.getPrice()<100);
       box.add(new Choco(100, 100));
       box.add(new JellyBean(40, 50));
       box.add(new JellyBean(30, 70));
       box.add(new JellyBean(20, 80));
       box.add(new JellyBean(200, 110));
       box.printAll();
       System.out.println("----------------------");

    }
}
