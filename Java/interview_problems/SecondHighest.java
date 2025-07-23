package interview_problems;

public class SecondHighest {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        int[] arr = {3, 56, 91, 43, 72, 5, 10, 100, 100};
//        Arrays.stream(arr).sorted();
//        System.out.println(arr[arr.length-2]); // 100 - fails as array has duplicated highest element
        printSecondHighest(arr);
        printSecondHighest(new int[]{20, 30, 90, 60, 10, 80});
        printSecondHighest(new int[]{20});
    }

    public static void printSecondHighest(int[] arr) {
        if (arr.length == 1) return;
        int highest = Integer.MIN_VALUE, secondHighest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            }

            if (arr[i] < highest && arr[i] > secondHighest) {
                secondHighest = arr[i];
            }
        }

        System.out.println(secondHighest);
    }
}
