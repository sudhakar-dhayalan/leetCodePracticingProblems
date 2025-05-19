package interview_problems;

import java.util.Arrays;
import java.util.List;

public class ClosestTarget {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,10,32,22,18,89);
        int target = 19;
        SolutionCT sol = new SolutionCT();
        System.out.println(sol.closestTarget(list, target));

        // Method created inside this class itself and called
        System.out.println(closestTarget2(list, target));
    }

    private static int closestTarget2(List<Integer> list, int num) {
        int target = 0;
        int diff = 10000;
        for (int n : list) {
            int closestDiff = num > n ? num - n: n - num;
            if (closestDiff < diff) {
                diff = closestDiff;
                target = n;
            }
        }
        return target;
    }
}

class SolutionCT {
    public int closestTarget(List<Integer> list, Integer num) {
        int target = 0;
        int diff = 10000;
        for (int n : list) {
            int closestDiff = num > n ? num - n: n - num;
            if (closestDiff < diff) {
                diff = closestDiff;
                target = n;
            }
        }
        return target;
    }
}