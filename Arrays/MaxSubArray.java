public class MaxSubArray {

    public static int subArrays(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i; j < arr.length; j++) {
                int m = 0;
                for (int k = i; k <= j; k++) {
                    m = m + arr[k];
                }
                // m == sum of sub array

                if(m>max){
                    max = m;
                }
            }
        }

        return max;
    }

    // by prefix method
    public static int ByPrefixMaxSubArrays(int arr[]) {

        int max = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        for(int i = 1 ; i<prefix.length ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int start = 0; start < arr.length; start++) {

            int m = 0;
            for (int end = start; end < arr.length; end++) {
                
                m = (start==0) ? prefix[end] : prefix[end] - prefix[start-1];

                if(m>max){
                    max = m;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int arr[] = { -5, 2, 4, -9, 1 };

        // System.out.println("Max sum is : "+subArrays(arr));

        subArrays(arr);
        System.out.println("Max sum is : "+ByPrefixMaxSubArrays(arr));
    }

}

// prefix[] = {-5 , -3 , 1 , -8 , -7}