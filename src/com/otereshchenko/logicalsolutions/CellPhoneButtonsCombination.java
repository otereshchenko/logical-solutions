package com.otereshchenko.logicalsolutions;

import java.util.Arrays;

public class CellPhoneButtonsCombination {
    private static final String[][] buttons = new String[][]{
            {"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"},
            {"j", "k", "l"}, {"m", "n", "o"}, {"p", "q", "r"},
            {"s", "t", "u", "v"}, {"w", "x", "y", "z"},
    };

    public static void main(String[] args) {
        printAllCombinationsOfLetters("", buttons[0], buttons[1], buttons[2]);
        System.out.println();
        printAllCombinationsOfLetters(buttons[0], buttons[1], buttons[2]);
    }

    private static void printAllCombinationsOfLetters(String prefix, String[]... buttons) {
        for (String letter : buttons[0]) {
            String result = prefix + letter;
            if (buttons.length == 1) {
                System.out.println(result);
            } else {
                printAllCombinationsOfLetters(result, Arrays.copyOfRange(buttons, 1, buttons.length));
            }
        }
    }

    private static void printAllCombinationsOfLetters(String[] button1, String[] button2, String[] button3) {
        for (String letter1 : button1) {
            for (String letter2 : button2) {
                for (String letter3 : button3) {
                    System.out.println(letter1 + letter2 + letter3);
                }
            }
        }
    }
}
