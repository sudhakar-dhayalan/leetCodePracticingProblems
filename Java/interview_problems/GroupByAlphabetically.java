package interview_problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByAlphabetically {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Deepa", "Rahul", "Akhil");
        // Output should be shown as {A=[Amit, Akhil], D=[Deepa], R=[Rahul]}
        System.out.println(
                names.stream()
                        .collect(
                                Collectors.groupingBy(
                                        e -> e.charAt(0)
                                )
                        )
        );
    }
}
