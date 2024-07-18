class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    void addFirst(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }

        temp.next = head;
        this.head = temp;
    }

    void add(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }

        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = temp;
    }

    void print() {

        System.out.println("This is Linked List elements : ");

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void addAtIndex(int index, int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node last = head;
        int i = 0;
        while (i < index - 1 && last.next != null) {
            last = last.next;
            i++;
        }

        temp.next = last.next;

        last.next = temp;
    }

    int removeFirst() {
        if (head == null) {
            return -1;
        }

        int data = head.data;
        head = head.next;
        return data;
    }

    int removeLast() {
        if (head == null || head.next == null) {
            head = null;
            return -1;
        }

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }

        int data = temp.next.data;
        temp.next = null;
        return data;
    }

}

public class SinglyLinkedList3 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(10);
        ll.addFirst(9);
        ll.addFirst(8);
        ll.add(11);

        ll.addAtIndex(3, 12);

        ll.removeFirst();
        ll.removeLast();
        ll.print();
    }
}
