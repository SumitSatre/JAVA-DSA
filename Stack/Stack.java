import java.util.ArrayList;

public class Stack {

    ArrayList<Integer> st = new ArrayList<>();

    boolean isEmpty(){
        return st.size() == 0;
    }

    void push(int data){
        st.add(data);
    }

    int pop(){
        if(st.isEmpty()){
            return -1;
        }

        int lastIndex = st.size();
        return st.remove(lastIndex-1);
    }

    void top(){
        if(st.isEmpty()){
            return;
        }

        int lastIndex = st.size();

        System.out.println("Top element is : " + st.get(lastIndex-1));
    }

    void addAtBottom(int data){
        st.add(0 , data);
    }

    void addAtBottomRecursion(Stack st , int data){
        
        if(st.isEmpty()){
            st.push(data);
            return;
        }
    }

    public static void main(String[] args){
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.addAtBottomRecursion(stack , 0);

        while(!stack.isEmpty()){
            System.out.println("Top element is : " +stack.pop());
        }
    }
}
