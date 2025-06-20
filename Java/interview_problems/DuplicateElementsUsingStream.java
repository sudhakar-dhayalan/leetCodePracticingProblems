package interview_problems;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElementsUsingStream {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {3, 4};
        List<Integer> duplicates;
        if (arr2.length > arr2.length) {
            Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
            duplicates = Arrays.stream(arr1).filter(set2::contains).boxed().toList();
        } else {
            Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
            duplicates = Arrays.stream(arr2).filter(set1::contains).boxed().toList();
        }

        System.out.println(duplicates);
    }
}
