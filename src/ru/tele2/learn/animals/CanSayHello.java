package ru.tele2.learn.animals;

public interface CanSayHello {
     void sayHello();

     default void dosmth(){
         System.out.println("привет из дефолтного метода");
     }
}
