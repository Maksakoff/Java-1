package ru.netology.sqr;

public class Counter  {

    public static void main(String[] args) {
        final int FIRST_NUMBER_RANGE = 10;
        final int LAST_NUMBER_RANGE = 99;
        final int LOWER_LIMIT = 200;
        final int UPPER_LIMIT = 300;

        OccurrenceСounter counter = new OccurrenceСounter();
        System.out.println("Количество вхождений: "
                + counter.occurrenceOfСount(FIRST_NUMBER_RANGE, LAST_NUMBER_RANGE, LOWER_LIMIT, UPPER_LIMIT));
    }
}

class OccurrenceСounter {
    public int occurrenceOfСount(int firstNumberRange, int lastNumberRange, int lowerLimit, int upperLimit) {
        int numberOccurence = 0;
        for (int i = firstNumberRange; i <= lastNumberRange; i++) {
            if (lowerLimit <= i * i && i * i <= upperLimit) {
                System.out.print("*** i= " + i + ", i**2 = " + i * i + "\n");
                numberOccurence++;
            }
        }
        return numberOccurence;
    }
}