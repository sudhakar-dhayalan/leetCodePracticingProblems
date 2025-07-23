package interview_problems;

import java.util.List;

import static concepts.LambdaExpression.square;

public class MinimumArrayCost {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 3, 5, 2, 10);
        System.out.println(minCostAfterInsertion(arr));  // Output: 49
    }

    private static long minCostAfterInsertion(List<Integer> arr) {
        int size = arr.size();
        int originalCost = 0;
        for (int i = 0; i < size - 1; i++) {
            originalCost += square(arr.get(i) - arr.get(i+1));
        }

        int minimalCost = originalCost;

        // Try inserting between every pair
        for (int i = 0; i < size - 1; i++) {
            int left = arr.get(i);
            int right = arr.get(i+1);

            // Try inserting mid near (left + right)/2
            for (int mid = (left + right) / 2 - 1; mid <= (left + right) / 2 + 1; mid++) {
                int newCost = originalCost;
                newCost -= square(left - right);
                newCost += square(left - mid);
                newCost += square(mid - right);
                minimalCost = Math.min(newCost, minimalCost);
            }
        }
        return minimalCost;
    }
}
