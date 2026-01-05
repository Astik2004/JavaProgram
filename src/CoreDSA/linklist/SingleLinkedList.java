package CoreDSA.linklist;

public class SingleLinkedList {
    Node head;
    public void insertAtBegining(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertAtPosition(int data,int pos)
    {
        Node newNode=new Node(data);
        if(pos==1)
        {
            insertAtBegining(data);
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++)
        {
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void deleteFromBeginning()
    {
        if(head!=null)
        {
            head=head.next;
        }
    }
    public void deleteFromEnd()
    {
        if(head==null || head.next==null)
        {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    public int getSize()
    {
        Node temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
    public boolean searchElement(int element)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==element)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
}
