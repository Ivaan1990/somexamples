package ru.tele2.learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class StatisticApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("test.txt"));
        Map<String, Integer> statistics = new LinkedHashMap<>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }
        for (Map.Entry item : statistics.entrySet()) {
            System.out.println("Слово " + item.getKey() + " встречается " + item.getValue() + " раз");
        }
    }
}
