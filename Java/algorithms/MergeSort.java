package algorithms;


import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        int arrSize = arr.length;
        if (arrSize == 1) return; // if the arr size is 1, it contains only 1 element and is sorted

        int midIndex = arrSize / 2;
        int[] leftArr = new int[midIndex];
        int[] rightArr = new int[arrSize - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftArr[i] = arr[i];
        }

        for (int i = midIndex; i < arrSize; i++) {
            rightArr[i - midIndex] = arr[i];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        // merge the two sorted array and storing them in the original array
        merge(arr, leftArr, rightArr);
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int leftArrSize = leftArr.length;
        int rightArrSize = rightArr.length;
        int i = 0, j = 0, k = 0; // i - to loop left rightIndex, ///r for right index and k for index of merge array

        while (i < leftArrSize && j < rightArrSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        for (; i < leftArrSize; i++) {
            arr[k] = leftArr[i];
            k++;
        }

        for (; j < rightArrSize; j++) {
            arr[k] = rightArr[j];
            k++;
        }
    }

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(2,1,4,3);
//        Collections.sort(list);
//        System.out.println(list);
//        Random random = new Random();
//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100);
//        }

        int[] arr = {2,1,4,3, -1, 10};

        System.out.println("--- Before Sorting ----");
        printArray(arr);

        mergeSort(arr);

        System.out.println("--- After Sorting ---");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}