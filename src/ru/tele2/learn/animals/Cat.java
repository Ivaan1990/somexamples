package ru.tele2.learn.animals;

public class Cat extends Animal implements CanSayHello, Comparable {
    public String name;
    int age;

    {
        message = "мяу мяу";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sayHello() {
        System.out.println("мяу мяу покорми меня, раб-человек");
    }

    @Override
    public String toString() {
        return "котик " + name + ", " + age + " годиков!";
    }

    @Override
    public int compareTo(Object o) {
        return (name.compareTo(((Cat) o).name));
    }
}




