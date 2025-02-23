package com.esstu.java_from_epam.Task8;

import java.util.Arrays;

public class TextCostCalculator {
    public static double calculateCost(String text, double wordCost) {
        String[] words = text.split("[\\p{Punct}\\s+]");
        words = Arrays.stream(words)
                    .filter(word -> !word.isEmpty())
                    .toArray(String[]::new);
        double totalCost = words.length * wordCost;
        return totalCost;
    }
}
