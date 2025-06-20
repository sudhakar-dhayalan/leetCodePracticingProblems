package interview_problems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccuranceChar {
    public static void main(String[] args) {
//        printMaxOccuringCharacter("Some text");
//        printMaxOccuringCharacter("Aabbccddee");
        printMaxOccuringCharacter("Sudhakarssa");

        System.out.println("Processing through only Stream api: ");
        System.out.println(
                "sudhakarssa".chars().mapToObj(e -> (char) e)
                        .map(Character::toLowerCase)
                        .collect(
                                Collectors.groupingBy(
                                        Function.identity(),
                                        Collectors.counting()
                                )
                        )
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .get()
                        .getKey()

        );
    }

    private static void printMaxOccuringCharacter(String text) {
        Map<Character, Integer> mapOfCharsWithTheirCount = getMapOfCharsWithTheirCount(text);
        System.out.println(mapOfCharsWithTheirCount);

        char c = getFirstMaxOccuringChar(mapOfCharsWithTheirCount);
        System.out.println(c);
    }

    private static char getFirstMaxOccuringChar(Map<Character, Integer> mapOfCharsWithTheirCount) {
        char maxOccurChar = '\0';
        int maxCharCount = 0;

        for (Map.Entry<Character, Integer> i : mapOfCharsWithTheirCount.entrySet()) {
            if (maxCharCount < i.getValue()) {
                maxCharCount = i.getValue();
                maxOccurChar = i.getKey();
            }
        }
        return maxOccurChar;
    }

    private static Map<Character, Integer> getMapOfCharsWithTheirCount(String text) {
        Map<Character, Integer> eachCharOccurence = new Hashtable<>();
        List<Character> charList = text.chars()
                .mapToObj(e -> (char) e)
                .map(Character::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(charList);

        for (char c : charList) {
            if (eachCharOccurence.get(c) == null) {
                eachCharOccurence.put(c, 1);
            } else {
                int count = eachCharOccurence.get(c) + 1;
                eachCharOccurence.put(c, count);
            }
        }
        return eachCharOccurence;
    }
}
