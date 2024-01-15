public class StackUsingLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head ;

    boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    void push(int data){
        Node temp = new Node(data);

        if(head == null){
            head = temp;
            return;
        }

        temp.next = head;
        head = temp;
    }

    int pop(){
        if(head == null){
            return -1;
        }

        int data = head.data;
        head = head.next;
        return data;
    }

    int top(){
        if(head == null){
            return -1;
        }

        int data = head.data;
        return data;
    }

    public static void main(String[] args){
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        

        while(!stack.isEmpty()){
            System.out.println("Top element is : " +stack.pop());
        }
    }
}
