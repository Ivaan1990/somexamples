package ru.tele2.learn.j8;

class AppJ8 {
    public static void main(String[] args) {
        Converter fromRurToEur = (rur) -> rur / 77;
        int priceInRur = 600;
        System.out.println(fromRurToEur.convert(priceInRur));


    }
}
