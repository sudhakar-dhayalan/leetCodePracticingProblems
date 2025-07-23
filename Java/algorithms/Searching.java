package algorithms;

public class Searching {
    public static void main(String[] args) {
        int[] sortedArr = {1, 2, 3, 4};
        int target = 3;
        int index = linerSearch(sortedArr, target);
        if (index > -1)
            System.out.println("Linear Search - Element found at index : " + index);
        else
            System.out.println("Linear Search - Element not found");

        int ind = binarySearch(sortedArr, target, 0, sortedArr.length - 1);
        if (ind > -1)
            System.out.println("Linear Search - Element found at index : " + ind);
        else
            System.out.println("Linear Search - Element not found");
    }

    private static int binarySearch(int[] sortedArr, int target, int left, int right) {
        if (left <= right) {
            int middle = (left + right) / 2;
            if (sortedArr[middle] == target) return middle;
            else if (target < sortedArr[middle]) {
                return binarySearch(sortedArr, target, left, middle);
            } else if (target > sortedArr[middle]) {
                return binarySearch(sortedArr, target, middle + 1, right);
            }
        }
        return -1;
    }

    private static int linerSearch(int[] sortedArr, int target) {
        for (int i = 0; i < sortedArr.length; i++) {
            if (sortedArr[i] == target) return i;
        }
        return -1;
    }
}
