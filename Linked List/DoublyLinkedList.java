class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    void addStart(int data) {

        Node temp = new Node(data);

        if (head == null) {
            head = tail = temp;
            return;
        }

        temp.next = head;
        head.prev = temp;
        head = temp;
    }

    void addLast(int data){
        Node temp = new Node(data);

        if(head == null || tail == null){
            head = tail = temp;
            return;
        }

        temp.prev = tail;
        tail.next = temp;
        tail = temp;
    }

    void removeFirst() {
        if (head != null) {
            if (head.next != null) {
                head = head.next;
                head.prev = null;
            } else {
                // Only one element in the list
                head = tail = null;
            }
        }
    }
    
    void removeLast() {
        if (tail != null) {
            if (tail.prev != null) {
                tail = tail.prev;
                tail.next = null;
            } else {
                // Only one element in the list
                head = tail = null;
            }
        }
    }
    

    void display() {

        Node temp = head;
        System.out.println("Items are : ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void displayBackward() {

        Node temp = tail;
        System.out.println("\nItems are : ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();

        dl.addStart(3);
        dl.addStart(2);
        dl.addLast(4);
        dl.addStart(1);
        dl.addLast(5);

        dl.removeFirst();
        dl.removeLast();
        dl.display();

        dl.displayBackward();
    }
}
