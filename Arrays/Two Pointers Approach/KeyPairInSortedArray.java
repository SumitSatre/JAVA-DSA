class KeyPairInSortedArray{

    public static void findExactSum(int arr[] , int sum){

        int left = 0 , right = arr.length-1;

        while(left<right){

            if((arr[left] + arr[right]) == sum){
                System.out.println("for sum : left : " +left + " , right : "+right);
                break;
            }

            if((arr[left] + arr[right]) < sum){
                left++;
            }
            else{
                right--;
            }
        }
    }

    public static void findExactDiff(int arr[] , int diff){

        int left = 0 , right = arr.length-1;

        while(left<right){

            if((arr[right] - arr[left]) == diff){
                System.out.println("for diff : left : " +left + " , right : "+right);
                break;
            }

            if((arr[right] - arr[left]) < diff){
                right--;
            }
            else{
                left++;
            }
        }
    }

    public static void main(String[] args){
        
        int arr[] = {1,2,2,4,4,6,6,8,8,9,11};

        int x = 5;

findExactSum(arr , x);
findExactDiff(arr , x);
    }
}