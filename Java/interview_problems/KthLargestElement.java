package interview_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, 4, 6, 1, 3, 24, 2, 10, 8, 12));
        printKthLargestElement(list, 2);
        printKthLargestElement(list, 4);
        printKthLargestElement(list, 1);
    }

    private static void printKthLargestElement(List<Integer> list, int kthLargestElement) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(kthLargestElement);
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (i < kthLargestElement) {
                minHeap.add(element);
            } else if (minHeap.peek() != null && element > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(element);
            }
        }
        System.out.println(kthLargestElement + "th largest element in the list " + list + " is " + minHeap.peek());
    }
}
