package concepts.linked_list;

public class UsingLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(8);
        list.insert(28);
        list.insert(22);

        list.insertAtFirst(1);
        list.insertAtFirst(-1);

        list.insertAtIndex(100, 4);
//        list.insertAtIndex(100, -3);
        list.show();
    }
}
