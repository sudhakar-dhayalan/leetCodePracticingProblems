package approaches.two_pointer;

public class RemoveNthNode {
    public static void main(String[] args) {
        // Using - java.util.LinkedList
        /* LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(list.size() - 2);
        System.out.println(list);
         */

        ListN listN = new ListN(1,
                new ListN(2,
                        new ListN(3,
                                new ListN(4,
                                        new ListN(5)
                                )
                        )
                )
        );
        printList(listN);
        int index = 1; // means delete value 3
        ListN result = deleteAtIndexFromLast(listN, index);
        printList(result);
    }

    private static ListN deleteAtIndexFromLast(ListN listN, int index) {
        ListN dummy = new ListN(0, listN);
        var fast = dummy;
        var slow = dummy;
        printList(dummy);

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= index; i++) {
            fast = fast.next;
        }
//        System.out.println(slow.data);
//        System.out.println(fast.data);

        // Move fast to the end, slow will be just before the target node
        // this is because this is gap of n b/w slow and fast
        // When fast reaches the end, slow is at (length - n - 1 = node before target)
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

//        System.out.println(slow.data);
//        slow.next = slow.next.next;
        return dummy.next; // skipping the 1st node, since it's a duplicate we added to handle list with only 1 element
    }

    private static void printList(ListN listN) {
        while (listN != null) {
            System.out.print(listN.data + " -> ");
            listN = listN.next;
        }
        System.out.print("null");
        System.out.println();
    }
}

class ListN { // ListNode
    int data;
    ListN next;

    public ListN(int val) {
        this.data = val;
        this.next = null;
    }

    public ListN(int val, ListN nextNode) {
        this.data = val;
        this.next = nextNode;
    }
}
