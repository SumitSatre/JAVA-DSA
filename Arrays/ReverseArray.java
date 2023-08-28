public class ReverseArray {
    
    public static void reverse(int arr[]){
        int start = 0 , end = arr.length-1;

        while(start<end){
            int temp ;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }

    public static void main(String[] args){

        int arr[] = {1,2,5,9,45,89,96,566};

        reverse(arr);

        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }

    }
}
