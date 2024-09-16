class QuickSort2{

    static void swap(int arr[] , int i , int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    } 

    static int partition(int arr[] , int s , int e){
    int pivot = arr[s];
    int count = 0;

    for(int i = s+1 ; i<=e ; i++){
        if(arr[i]<=pivot){
            count++;
        }
    }

    int pivotIndex = s + count;
    swap(arr , pivotIndex , s);

    int i = s, j = e;
    while(i<pivotIndex && j>pivotIndex){
        while(arr[i]<pivot){
            i++;
        }

        while(arr[j]>pivot){
            j--;
        }

        swap(arr , i++ , j--);
    }
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

    Arrays.sort();


    for(int i = 0 ; i<arr.length ; i++){
        System.out.print(arr[i] + "  ");            
    }

    }
}