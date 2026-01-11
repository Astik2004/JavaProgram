package CoreDSA.Stack;
public class StackImpl {
    Node top;
    public void push(int data)
    {
        Node node=new Node(data);
        node.next=top;
        top=node;
    }
    public int pop()
    {
        if(top==null)
        {
            System.out.println("Stack underflow!..");
            return -1;
        }
        int data=top.data;
        top=top.next;
        return data;
    }
    public int peek()
    {
        if(top==null)
        {
            System.out.println("Stack is Empty..!");
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty()
    {
        return top==null;
    }
}
