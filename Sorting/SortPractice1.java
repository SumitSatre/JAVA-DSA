class SortPractice1{

    static void MergeTwoSortedArrays(int arr[] , int s , int e){
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

        index = s;

        int i = 0 , j = 0; 
        while(i<len1 && j<len2){
            if(a1[i] < a2[j]){
                arr[index++] = a1[i++];
            }
            else{
                arr[index++] = a2[j++];
            }
        }

        while(i<len1){
            arr[index++] = a1[i++];
        }

        while(j<len2){
            arr[index++] = a2[j++];
        }
    }

    public static void main(String[] args){
        
        int arr[] = {1,2,6,8,9 , -1,5,9,15,19};

        MergeTwoSortedArrays(arr , 0 , arr.length-1);
        for(int i : arr){
            System.out.print(i + "  ");
        }
    }
}