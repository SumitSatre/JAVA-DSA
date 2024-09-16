import java.util.*;

class Node {
  int data;
  Node next;

  Node(int d) {
    this.data = d;
  }
}

public class LinkedListQueue {
  Node head = null;
  Node tail = null;

  boolean isEmpty() {
    return head == null;
  }

  void add(int d) {
    Node temp = new Node(d);

    if (head == null && tail == null) {
      head = tail = temp;
    } else {
      tail.next = temp;
      tail = temp;
    }
  }

  int remove() {
    if (head == null) {
      return -1;
    } else {
      int poppedData = head.data;

      if (head == tail) {
        head = tail =null;
      } else {
        head = head.next;
      }

      return poppedData;
    }
  }

  public static void main(String[] args) {

//    LinkedListQueue queue = new LinkedListQueue();
//
//    // Adding elements to the queue
//    queue.add(5);
//    queue.add(6);
//    queue.add(7);
//    queue.add(8);
//    queue.add(9);
//
//    // Removing and printing elements from the queue until it's empty
//    while (!queue.isEmpty()) {
//      System.out.println("Element is: " + queue.remove());
//    }
//
//    queue.add(5);
//    queue.remove();''

    Queue<Integer> queue = new LinkedList<>();
    queue.add(5);
    queue.add(6);
    queue.add(7);
    queue.add(8);
    queue.add(9);

    System.out.println(queue.peek());
  }
}
