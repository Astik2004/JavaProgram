package CoreDSA.Queue;

public class QDriver {
    public static void main(String[] args) {
        QueueImpl q=new QueueImpl();
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
    }
}
