public class PairsInArray {
    
    public static void findPairs(int arr[]){

        for(int i = 0 ; i< arr.length-1 ; i++){

            for(int j = i+1 ; j<arr.length ; j++){
                System.out.print("(" + arr[i] + " , "+arr[j] + ")");
            }

            System.out.print("\n");
        }
    }

    public static void main(String[] args){

        int arr[] = {1,2,5,9,45};

        findPairs(arr);
    }
}
