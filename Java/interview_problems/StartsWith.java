package interview_problems;

import java.util.Arrays;
import java.util.List;

// {22, 2, 28, 245, 289}
// convert arr of numbers to arr of string and return the list that starts with "2" using JAVA STREAM
public class StartsWith {
    public static void main(String[] args) {
        int[] arr = {22, 2, 28, 245, 289};
        // :: - method reference
        List<String> list = Arrays.stream(arr).mapToObj(String::valueOf).filter(s -> s.startsWith("2")).toList();
//        List<String> list = Arrays.stream(arr).mapToObj(n -> String.valueOf(n)).filter(s -> s.startsWith("2")).toList();
        System.out.println(list);
    }
}
