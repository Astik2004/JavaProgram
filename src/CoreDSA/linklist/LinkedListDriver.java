package CoreDSA.linklist;

public class LinkedListDriver {
    public static void main(String[] args) {
        SingleLinkedList sll=new SingleLinkedList();
        //Add at Last
        System.out.println("Add from Last");
        sll.insertAtEnd(10);
        sll.insertAtEnd(11);
        sll.insertAtEnd(12);
        sll.insertAtEnd(13);
        sll.insertAtEnd(14);
        sll.insertAtEnd(15);
        sll.printList();
        //Add at Begining
        System.out.println("Add from Begining");
        sll.insertAtBegining(9);
        sll.insertAtBegining(8);
        sll.printList();
        //Insert at particuler position
        System.out.println("Inserting At perticuler position");
        sll.insertAtPosition(100,3);
        sll.printList();
        // Delete from Begining
        System.out.println("Delete from begining");
        sll.deleteFromBeginning();
        sll.printList();
        //Delete from End
        System.out.println("Delete from End");
        sll.deleteFromEnd();
        sll.printList();
        System.out.println("Size of Linked List : "+sll.getSize());
        System.out.println(sll.searchElement(12));
    }
}
