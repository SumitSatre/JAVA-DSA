import java.util.Stack;

public class PushAtBottom {

    static void pushAtBottom(Stack<Integer> st , int key){
        if(st.empty()){
            st.push(key);
            return;
        }

        int data = st.pop();

        pushAtBottom(st, key);

        st.push(data);
    }

    static void reverse(Stack<Integer> st){
        if(st.empty()){
            return;
        }

        int data = st.pop();

        reverse(st);

        pushAtBottom(st , data);
    }

    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        pushAtBottom(st , 5);

        reverse(st);

        while(!st.empty()){
            System.out.print(st.pop() + " ");
        }
    }
}
