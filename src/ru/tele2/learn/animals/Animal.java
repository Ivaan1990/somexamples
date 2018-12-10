package ru.tele2.learn.animals;

public abstract class Animal implements CanSayHello {

    String message = "Переопредели меня!";

     public void voice(){
         System.err.println(message);
     }

    @Override
    public void sayHello() {
        System.out.println("мяу мяу покорми меня, раб-человек");
    }
}
