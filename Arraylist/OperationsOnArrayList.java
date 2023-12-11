import java.util.ArrayList;
import java.util.Collections;

class OperationsOnArrayList{
    public static void main(String[] args){

    ArrayList<Integer> list = new ArrayList<>();        

    // add elements 
    list.add(3);
    list.add(4);
    list.add(38);
    list.add(45);
    list.add(2);

    System.out.println(list);

    // get element at particular index
    System.out.println(list.get(2));

    // set or modify element at particular index
    list.set(2 , 56);
    System.out.println(list);

    // get size of ArrayList
    System.out.println(list.size());

    // remove element at particular index
    list.remove(2);
    System.out.println("after removed"+list);  // that element is removed and size is decreased by one

    // get element at particular index
    System.out.println("list.indexOf(2) : " + list.indexOf(2));

    // used to sort ArrayList
    Collections.sort(list);
    System.out.println(list);

    // used to sort in descending order ArrayList
    Collections.sort(list , Collections.reverseOrder());
    System.out.println(list);
    
    // want to add element at parrticular index
    list.add(2,56);
     System.out.println(list);

    // if value is present ar arraylist return true else false
     System.out.println(list.contains(56));
    }
}