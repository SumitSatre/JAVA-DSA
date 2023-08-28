public class printSubArrays {

    public static void subArrays(int arr[]){

        for(int i = 0 ; i< arr.length-1 ; i++){

            for(int j = i ; j<arr.length ; j++){
                
                System.out.print("{ ");
                for(int k = i ; k<=j ;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.print("} ");

            }

            System.out.print("\n");
        }
    }

    public static void main(String[] args){

        int arr[] = {1,2,5,9,45};

        subArrays(arr);
    }
}
