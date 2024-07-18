import java.util.Queue;

public class QueueUsingArray {
    int front = -1;
    int rear = -1;
    int arr[];
    int capacity;
    int size;

    QueueUsingArray(int size){
        capacity = size;
        arr = new int[size];
        front = 0;
        this.size = 0;
    }

    public void enqueue(int val){
        if(isFull()){
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = val;
        this.size++;
    }

    public int dequeue(){
        if(isEmpty()){
            return -1;
        }

        int val = arr[front];
        front = (front + 1) % capacity;
        this.size--;
        return val;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(size == capacity){
            return true;
        }
        return false;
    }

    public int size(){
        return this.size;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Front element is: " + queue.peek());
        System.out.println("Queue size is " + queue.size());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Front element is: " + queue.peek());
        System.out.println("Queue size is " + queue.size());

        queue.enqueue(6);
        queue.enqueue(7);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        System.out.println("Queue size is " + queue.size());
    }
}
