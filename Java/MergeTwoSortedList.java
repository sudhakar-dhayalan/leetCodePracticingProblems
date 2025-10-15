import java.util.stream.IntStream;

// 7: 40
public class MergeTwoSortedList {
    public static void main(String[] args) {
        NodeLi list1 = new NodeLi(1, new NodeLi(3, new NodeLi(5, new NodeLi(7))));
        NodeLi list2 = new NodeLi(2, new NodeLi(4, new NodeLi(6, new NodeLi(8))));
        printList(list1);
        printList(list2);
        NodeLi mergeList = mergeList(list1, list2);
        printList(mergeList);
    }

    private static NodeLi mergeList(NodeLi l1, NodeLi l2) {
        // IMPORTANT: So tail is where you attach new nodes, and dummy is how you remember where the list started
        NodeLi dummy = new NodeLi(-1);
        NodeLi tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // One of them might still have elements left
        tail.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

    public static void printList(NodeLi node) {
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("null");
        System.out.println();
    }
}

class NodeLi {
    int value;
    NodeLi next;

    public NodeLi(int val, NodeLi nodeLi) {
        this.value = val;
        this.next = nodeLi;
    }

    public NodeLi(int value) {
        this.value = value;
        this.next = null;
    }
}