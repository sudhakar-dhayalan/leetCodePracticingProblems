class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveKthFromEnd {

    public ListNode removeKthFromEnd(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast ahead by k + 1 steps to maintain the gap
        for (int i = 0; i <= k; i++) {
            if (fast == null) return head; // k is larger than the list length
            fast = fast.next;
        }

        // Move fast to the end, maintaining the gap
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Skip the desired node
        slow.next = slow.next.next;

        return dummy.next;
    }

    // Helper method to print list (optional for testing)
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Example usage
    public static void main(String[] args) {
        RemoveKthFromEnd solution = new RemoveKthFromEnd();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original list: ");
        solution.printList(head);

        int k = 4;
        head = solution.removeKthFromEnd(head, k);

        System.out.print("After removing " + k + "th node from end: ");
        solution.printList(head);
    }
}
