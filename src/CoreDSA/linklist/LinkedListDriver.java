package CoreDSA.linklist;

public class LinkedListDriver {
    public static void main(String[] args) {
        SingleLinkedList sll=new SingleLinkedList();
        sll.insertAtEnd(10);
        sll.insertAtEnd(11);
        sll.insertAtEnd(12);
        sll.insertAtEnd(13);
        sll.insertAtEnd(14);
        sll.insertAtEnd(15);

        sll.printList();
    }
}
