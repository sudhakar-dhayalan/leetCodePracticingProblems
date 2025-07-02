package interview_problems;

import java.util.Arrays;
import java.util.List;

public class EvenNumberSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 10, 3, 8, 2, 4, 5, 7);
        int sum = 0;
        for (int x = 0; x < numbers.size(); x++) {
            if (numbers.get(x) % 2 == 0)
                sum = sum + numbers.get(x);
        }

        System.out.println(sum);
        System.out.println(
                numbers.stream()
                        .filter(n -> n % 2 == 0)
//                        .reduce(0, Integer::sum)
                        .mapToInt(Integer::intValue)
                        .sum()
        );
    }
}
