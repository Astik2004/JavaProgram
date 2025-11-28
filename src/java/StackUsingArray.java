package java;

public class StackUsingArray {
    private int top;
    private int [] stack;
    private int maxSize;
    public StackUsingArray(int size)
    {
        this.top=-1;
        this.maxSize=size;
        this.stack=new int[maxSize];
    }
    public void push(int val)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
            return;
        }
        stack[++top]=val;
        System.out.println("Value Pushed in Stack "+val);
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top--];
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }
    public boolean isFull()
    {
        return top==maxSize-1;
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
}
