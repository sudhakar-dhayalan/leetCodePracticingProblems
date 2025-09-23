package interview_problems;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    arr.add(0);
    arr.add(1);
    buildFibonacci(10, arr);
    System.out.println(arr);
}

    private static void buildFibonacci(int limit, List<Integer> arr) {
        int size = arr.size();
        if (size < limit) {
            int lastEle = arr.get(size - 1);
            int secondLastEle = arr.get(size - 2);
            arr.add(lastEle + secondLastEle);
            buildFibonacci(limit, arr);
        }
    }
}
