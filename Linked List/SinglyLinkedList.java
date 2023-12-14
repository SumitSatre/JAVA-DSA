class Node {
    int data;
    Node next;

    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    void add(int data) {
        Node temp = new Node(data);

        if (head == null) {
            tail = head = temp;
            return;
        }

        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = temp;
        tail = temp;
    }

    void addAtFront(int d) {
        Node temp = new Node(d);

        if (head == null) {
            tail = head = temp;
            return;
        }

        temp.next = head;

        head = temp;
    }

    void addAtIndex(int data, int index) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
            return;
        }

        int i = 0;

        Node last = head;

        while (i < index - 1 && last != null) {
            last = last.next;
            i++;
        }
        temp.next = last.next;

        last.next = temp;

        if(temp.next == null){
            tail = temp;
        }
    }

    public void removeFirst() {

        if (head != null) {
            //if (head.next == null) {
            //    head = tail = null;
            //    return;
            //}
            head = head.next;
        } else {
            System.out.println("LinkedList is empty");
        }
    }

    public void removeLast() {

        if (head != null) {
            head = head.next;
        }
    }

    public void search(int data){

        Node temp = head;

        int i = 0;

        while(temp != null){

            if(temp.data == data){
                System.out.println("The element is at index : " + i);
                return;
            }

            temp = temp.next;
            i++;
        }

        System.out.println("The element not found!");
    }

    public void searchRecursion(Node temp , int data){

        if(temp != null){
            if(temp.data == data){
                System.out.println("The element is found ");
                return;
            }
            
            searchRecursion(temp.next, data);
        }
        else{
            System.out.println("The element is not found ");
        }
    }

    public void display() {
        Node temp = head;

        System.out.println("\nElements : ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void size() {
        Node temp = head;

        int len = 0;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        System.out.println("\n Size is : " + len);
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.display();

        linkedList.addAtFront(0);

        linkedList.display();

        linkedList.addAtIndex(9, 0);

        linkedList.display();

        linkedList.size();
        linkedList.removeFirst();
        linkedList.display();

        System.out.println("tails data : " + linkedList.tail.data);

        linkedList.search(2);

        linkedList.searchRecursion(linkedList.head , 2);
    }

}

