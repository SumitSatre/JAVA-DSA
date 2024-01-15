public class CircularQueue {
  int front;
  int rear;
  int arr[];
  int size;

  CircularQueue(int n) {
    front = -1;
    rear = -1;
    arr = new int[n];
    size = n;
  }

  boolean isEmpty(){
    return (front == -1 && rear == -1);
  }

  void add(int element){
    if((rear+1)%size == front){
      return;
    }

    if(front == -1){
      front = (rear+1)%size;
    }

    rear = (rear+1)%size;
    arr[rear] = element;
  }

  int remove(){
    if((front == -1 && rear == -1)){
      return -1;
    }

    int poppedElement = arr[front];

    if(front == rear){
      front = -1;
      rear = -1;
    }
    else{
      front = (front+1)%size;
    }
    return poppedElement;
  }

  public static void main(String[] args) {
    CircularQueue circularQueue = new CircularQueue(5);

    // Adding elements to the circular queue
    circularQueue.add(5);
    circularQueue.add(6);
    circularQueue.add(7);
    circularQueue.add(8);

    // Removing and printing elements from the circular queue
    while (!circularQueue.isEmpty()) {
      System.out.println("Removed Element: " + circularQueue.remove());
    }
  }
}
