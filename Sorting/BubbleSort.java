public class BubbleSort {

    public static void BubbleSortFunction(int arr[]){

        for(int i = 0 ; i < arr.length-1 ; i++ ){
            for(int j = 0 ; j<arr.length-i-1 ;j++ ){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int arr[] = {5,484,13,21,1,-332,16,51,6845,-1};

        BubbleSortFunction(arr);

        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ "  ");
        }
    }
}
