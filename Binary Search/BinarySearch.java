public class binarySearch{

    public static int Search(int arr[] , int key){

        int start = 0 , end = arr.length -1;
        int mid = (start+end)/2;

        while(start<=end){
            if(arr[mid] == key){
                return mid;
            }
            else if(key > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

            mid = (start+end)/2;
        }
        return -1;
    } 

    public static void main(String []args){
        int arr[] = {1,2,5,9,45,89,96,566};

        System.out.println( Search(arr , 556) );
    }
}
