import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        Solution sol = new Solution();
        int[] result = sol.twoSum(new int[]{4, 2, 1}, 3);
        System.out.println(Arrays.toString(result));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // 4, 2, 1
            if (map.get(nums[i]) != null) {
                return new int[]{map.get(nums[i]), i};
            }

            int secNum = target - nums[i];
            map.put(secNum, i); // [{-1 - expectedSecondTargetNum, 0 - indexOfAssumedFirstTargetNum}, {1, 1}, {}]
        }
        return new int[]{};
    }
}
// [{2, 0}, {}]