class QuickSort{

    static void swap(int arr[] , int i , int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    } 

    static int partition(int arr[] , int s ,int e){

        int pivot = arr[e];

        int i = s;
        int index = s;
        while(i<e){
            if(arr[i] < pivot){
                swap(arr , index , i);
                index++;
            }
            i++;
        }

        int pivotIndex = index;
        swap(arr , pivotIndex , e);

        return pivotIndex;
    }

    static void quickSort(int arr[] , int s ,int e){

        if(s>=e){
            return;
        }

        int p = partition(arr , s , e);

        quickSort(arr , s , p-1);
        quickSort(arr , p+1 , e);
    }

    public static void main(String [] args){

    int arr[] = {1,5,9,2,8,89,-5,45,18 , 59};

    quickSort(arr , 0 ,arr.length-1);


    for(int i = 0 ; i<arr.length ; i++){
        System.out.print(arr[i] + "  ");            
    }

    }
}