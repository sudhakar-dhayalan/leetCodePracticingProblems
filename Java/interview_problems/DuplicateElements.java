package interview_problems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 5, 3);
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer n : list) {
            if (!unique.add(n)) duplicates.add(n);
        }

        System.out.println(duplicates);

        System.out.println(
                list.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Function.identity(),
                                        Collectors.counting()
                                )
                        )
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue() > 1)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toSet())
        );
    }
}
