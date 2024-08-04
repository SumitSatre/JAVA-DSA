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

    public static void reverseRecursion(int arr[] , int i){
        if(i >= arr.length/2){
            return;
        }
        int last = arr.length-i-1;
        arr[last] = arr[i] ^ arr[last];
        arr[i] = arr[i] ^ arr[last];
        arr[last] = arr[i] ^ arr[last];

        reverseRecursion(arr , i+1);
    }

    public static boolean isPallindrome(String str , int i){
        if(i>=str.length()){
            return true;
        }

        int last = str.length()-i-1;
        if(str.charAt(i) == str.charAt(last)){
            return isPallindrome(str , i+1);
        }
        return false;
    }

    public static void main(String[] args){

        int arr[] = {1,2,5,9,45,89,96,566};

        reverse(arr);
        reverseRecursion(arr , 0);

        String a = "ababa";
        System.out.println(isPallindrome(a , 0));

        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }

    }
}
