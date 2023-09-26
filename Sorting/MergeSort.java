class MergeSort{
    static void mergeSortedArrays(int arr[] , int s , int e){
        int mid = (s+e)/2;
        int len1 = mid-s+1;
        int len2 = e-mid;

        int a1[] = new int[len1];
        int a2[] = new int[len2];

        int index = s;
        for(int i = 0 ; i<len1 ; i++){
            a1[i] = arr[index++];             
        }

        for(int i = 0 ; i<len2 ; i++){
            a2[i] = arr[index++];             
        }

        int i = 0 , j = 0 , k=s;
        while(i<len1 && j<len2){
            if(a1[i] < a2[j]){
                arr[k++] = a1[i++];
            }
            else{
                arr[k++] = a2[j++];
            }
        }

        while(i<len1){
            arr[k++] = a1[i++];
        }

        while(j<len2){
            arr[k++] = a2[j++];
        }
    }

    static void mergSorting(int arr[] , int s , int e){

        if(s>=e){
            return;
        }

        int mid = (s+e)/2;

        mergSorting(arr , s , mid);
        
        mergSorting(arr , mid+1 , e);

        mergeSortedArrays(arr , s , e);

    }

    public static void main(String [] args){

    int arr[] = {1,5,9,2,8,89};

    mergSorting(arr , 0 ,5);

    for(int i = 0 ; i<arr.length ; i++){
        System.out.print(arr[i] + "  ");            
    }

    }
}