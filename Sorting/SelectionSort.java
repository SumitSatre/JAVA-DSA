public class SelectionSort {
    public static void SelectionSortFunction(int arr[]){

        for(int i = 0 ; i < arr.length-1 ; i++ ){
            int MinIndex = i;
            for(int j = i+1 ; j<arr.length ;j++ ){
                if(arr[j] < arr[MinIndex]){
                    MinIndex = j;
                }
            }

            // swap
            int temp = arr[MinIndex];
            arr[MinIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args){
        int arr[] = {5,484,13,21,1,-332,16,51,6845,-1};

        SelectionSortFunction(arr);

        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ "  ");
        }
    }
}
