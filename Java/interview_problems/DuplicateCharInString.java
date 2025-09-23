package interview_problems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String name = "only_duplicate_character_in_this_string_is_printed along with count";
        // print duplicates and their count using stream

        Stream<Map.Entry<Character, Long>> entryStream = name.chars().mapToObj(e -> (char) e)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                )
                .entrySet()
                .stream()
                .filter(k -> k.getValue() > 1);

        entryStream.forEach(e-> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
