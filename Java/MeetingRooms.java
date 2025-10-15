import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms {

    /**
     * intervals: array of [start, end) times
     * Returns the minimum number of meeting rooms required.
     */
    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        // Sort by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

//        Arrays.stream(intervals).map(e -> System.out.println(Arrays.stream(e).boxed().toList()));
        // Min-heap for end times
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Process each meeting
        for (int[] meeting : intervals) {
            int start = meeting[0];
            int end = meeting[1];

            // If a room is free (earliest end <= current start), reuse it
            if (!minHeap.isEmpty() && minHeap.peek() <= start) {
                minHeap.poll();
            }
            // Allocate current meeting's end time
            minHeap.offer(end);
            System.out.println(minHeap);
        }

        // Number of rooms = size of heap
        return minHeap.size();
    }

    // Example usage
    public static void main(String[] args) {
        int[][] meetings = {
                {0, 30},
                {5, 10},
                {15, 20}
        };
        System.out.println(minMeetingRooms(meetings)); // prints 2
    }
}
