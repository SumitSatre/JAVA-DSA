import java.util.Collections;
import java.util.ArrayList;

class Practice1 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(-1);
        arr.add(45);
        arr.add(2);

        System.out.println(arr);

        // Tis removes at particular index
        arr.remove(3);

        System.out.println(arr.get(2));

        System.out.println(arr);

        arr.set(2 , 63);

        Collections.sort(arr , Collections.reverseOrder());
        System.out.println(arr);

        arr.add(3 , 48);

        System.out.println(arr);
    }
}