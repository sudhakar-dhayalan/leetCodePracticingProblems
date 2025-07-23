package concepts.linked_list;

public class LinkedList {
    Node head;

    public void insert(int num) {
        Node node = new Node();
        node.data = num;
        node.next = null;

        if (head == null) { // 10,100 8,null
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtFirst(int value) {
        Node node = new Node();
        node.data = value;
        node.next = null;

        node.next = head;
        head = node;
    }

    public void insertAtIndex(int value, int index) {
        if (index < 0) {
            throw new Error("Enter Valid index");
        }
        Node node = new Node();
        node.data = value;
        node.next = null;

        if (index == 0) {
            insertAtFirst(value);
        } else {
            Node n = head;
            for (int i = 1; i < index; i++) {
                if (n == null) {
                    throw new Error("Array out of bound");
                }
                n = n.next;
            }

            node.next = n.next;
            n.next = node;
        }
    }

    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
//            System.out.println(this.node.next);

            n = n.next;
        }
        System.out.println(n.data);
//        System.out.println(this.node.next);
    }
}
