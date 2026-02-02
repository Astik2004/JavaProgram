package CoreDSA.Queue;

public class QueueImpl {
    Node front,rear;
    public void enqueue(int data)
    {
        Node newNode=new Node(data);
        if(front==null)
        {
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    public int dequeue()
    {
        if(front==null)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        int val=front.data;
        front=front.next;
        if(front==null)
        {
            rear=null;
        }
        return val;
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Empty Queue");
            return -1;
        }
        return front.data;
    }
    public boolean isEmpty()
    {
        return front==null;
    }
    public void display()
    {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node temp = front;
        System.out.print("Queue (Front to Rear): ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
