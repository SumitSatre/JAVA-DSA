class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList1 {

    Node head;
    Node tail;

    void addLast(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = tail = temp;
            return;
        }

        tail.next = temp;
        tail = temp;
    }

    void addFirst(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = tail = temp;
            return;
        }

        temp.next = head;
        head = temp;
    }

    void addAtIndex(int index, int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = tail = temp;
            return;
        }

        if (index == 0) {
            temp.next = head;
            head = temp;
            return;
        }

        int i = 0;
        Node last = head;

        while (i < index - 1 && last.next != null) {
            last = last.next;
            i++;
        }

        temp.next = last.next;
        last.next = temp;
    }

    void deleteAtIndex(int index) {

        if (index == 0) {
            head = head.next;
            return;
        }
        if (head == null) {
            return;
        }

        Node temp = head;

        int i = 0;
        while (i < index - 1) {
            if (temp == null) {
                System.out.println("Index was invalid");
                return;
            }
            temp = temp.next;
            i++;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }

    }

    void reverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node pre = null , curr = head , next;

        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        head = pre;
    }

    void slowAndFast(){
        Node slow = head , fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.data);

    }

    boolean detectCycle(){
        Node slow = head , fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
        
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("\n");
    }
}

class SinglyLinkedList2 {
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();

        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);

        ll.addFirst(4);
        ll.display();

        ll.addAtIndex(1, 2);
        ll.display();

        ll.deleteAtIndex(5);
        ll.display();

        ll.reverse();
        ll.display();

        ll.slowAndFast();
        ll.display();

        System.out.println("Cycle is : " + ll.detectCycle());
    }
}
