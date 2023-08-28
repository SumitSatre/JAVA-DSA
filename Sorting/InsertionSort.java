public class InsertionSort {
    public static void InsertionSortFunction(int arr[]){
        int i , j;
        for(i = 1 ; i < arr.length ; i++ ){
            int element = arr[i];
            for(j = i-1 ; j>=0 ;j-- ){
                if(arr[j] > element ){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = element;
        }
    }

    public static void main(String[] args){
        int arr[] = {5,484,13,21,1,-332,16,51,6845,-1};

        InsertionSortFunction(arr);

        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ "  ");
        }
    }
}
