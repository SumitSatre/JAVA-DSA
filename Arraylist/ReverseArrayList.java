import java.util.ArrayList;

class ReverseArrayList{

    public static void reverseArrayList(ArrayList<Integer> list){
        
        for(int i = 0 , j = list.size()-1 ; i< (list.size()/2) ; i++ , j--){
            int temp = list.get(i); 
            list.set(i , list.get(j));
            list.set(j , temp);
        }
    }

    public static int findMax(ArrayList<Integer> list){
        
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }

        return max;
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        reverseArrayList(list);

        System.out.println(list);

        System.out.println(findMax(list));
    }
} 