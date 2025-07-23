package interview_problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementStartingWith {
    public static void main(String[] args) {
        int[] arr = {110, 15, 8, 49, 25, 98, 32, 14, 10};

        List<Integer> result = Arrays.stream(arr)
                .boxed() // Convert int to Integer
                .filter(num -> String.valueOf(num).startsWith("1"))
                .toList();

        System.out.println("Elements starting with 1: " + result);
    }
}
