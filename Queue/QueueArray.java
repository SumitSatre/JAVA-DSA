public class QueueArray {
  int arr[];
  int rear;
  int size;

  // Constructor to initialize the queue with a given size
  QueueArray(int n) {
    arr = new int[n];
    rear = -1;
    size = n;
  }

  // Check if the queue is empty
  boolean isEmpty() {
    return rear == -1;
  }

  // Add an element to the rear of the queue
  void add(int element) {
    if (rear == size - 1) {
      return; // Queue is full, cannot add more elements
    }

    rear++;
    arr[rear] = element;
  }

  // Remove and return the element from the front of the queue
  int remove() {
    if (rear == -1) {
      return -1; // Queue is empty, cannot remove elements
    }

    int first = arr[0];

    // Shift elements to the left to fill the gap created by removing the first element
    for (int i = 0; i < rear; i++) {
      arr[i] = arr[i + 1];
    }
    rear--;

    return first;
  }

  // Main method to demonstrate the QueueArray functionality
  public static void main(String[] args) {

    QueueArray queue = new QueueArray(5);

    // Adding elements to the queue
    queue.add(5);
    queue.add(6);
    queue.add(7);
    queue.add(8);
    queue.add(9);

    // Removing and printing elements from the queue until it's empty
    while (!queue.isEmpty()) {
      System.out.println("Element is: " + queue.remove());
    }
  }
}

/*  add(int element): O(1) - Constant time complexity as it involves a simple assignment and increment operation.
remove(): O(n) - Linear time complexity due to the shifting of elements in the array. In the worst case, all elements need to be shifted when removing the front element. This operation could be optimized to O(1) by using a circular array or linked list to implement the queue.
*/