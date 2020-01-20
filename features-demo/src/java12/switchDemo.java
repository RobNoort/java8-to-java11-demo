package java12;

import java.util.ArrayList;
import java.util.Random;

public class switchDemo {


    // Actually 13
    public static void main(String[] args) {
        var fruitList = new ArrayList<String>();
        fruitList.add("PEAR");
        fruitList.add("APPLE");
        fruitList.add("MANGO");
        fruitList.add("GRAPE");
        fruitList.add("PAPAYA");
        fruitList.add("ORANGE");

        Random random = new Random();
        Integer winner = random.nextInt(fruitList.size());
        String fruit = fruitList.get(winner);

        int numberOfLetters;

        // old school
        switch (fruit) {
            case "PEAR" : numberOfLetters = 4;
            default: numberOfLetters = 0;
        }

        numberOfLetters = switch (fruit) {
            case "PEAR" -> 4;
            case "APPLE", "MANGO", "GRAPE" -> 5;
            case "ORANGE", "PAPAYA" -> 6;
            default -> 0;
        };


        System.out.println(String.format("Result letters of %s: %d", fruit, numberOfLetters));
    }
}
