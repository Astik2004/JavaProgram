package CoreDSA.Stack;

public class Main {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Is Empty? " + stack.isEmpty());
        System.out.println("Popped: " + stack.pop());

    }
}
