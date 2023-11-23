class MaxConsecutiveOfOnes{
    public static void main(String[] args){
        int arr[] = {1,1,0,1,1,1,1,0,0,1,1};

        int candidate = 1 , count = 0 , maxCount = 0;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == 1){
                count++;
            }
            else{
                if(count>maxCount){
                    maxCount = count;
                }
                count = 0;
            }
        }

        System.out.println("Max count is : " + maxCount);
    }
}