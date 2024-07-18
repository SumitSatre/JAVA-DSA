import java.util.ArrayList;

class Stack {
    ArrayList<Character> st = new ArrayList<>();

    boolean isEmpty(){
        return st.size() == 0;
    }

    void push(char data){
        st.add(data);
    }

    char pop(){
        if(st.isEmpty()){
            return '1';
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

    void addAtBottom(char data){
        st.add(0 , data);
    }

    

    
}

public class ReverseStringUsingStack {
    public static void main(String[] args){
        Stack stack = new Stack();

        String s = "Sumit";

        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            stack.push(ch);
        } 

        StringBuilderMethods result = new StringBuilderMethods();

        while(!stack.isEmpty()){
            char ch = stack.pop();
            result.append(ch);
        }

        System.out.println(result.toString());

    }
}
