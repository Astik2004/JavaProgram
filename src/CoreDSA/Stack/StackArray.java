package CoreDSA.Stack;

public class StackArray {
    final private int [] arr;
    private int top;
    final private int capacity;

    StackArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int data)
    {
        if(top==capacity-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top]=data;
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }
    public int peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public int size()
    {
        return top+1;
    }
    public static void main(String[] args) {
        StackArray s=new StackArray(5);
        s.push(100);
        s.push(50);
        s.push(25);
        s.push(75);
        s.push(125);
        System.out.println("Peek "+s.peek());
        System.out.println("Pop "+s.pop());
        System.out.println("Size "+s.size());
    }
}

