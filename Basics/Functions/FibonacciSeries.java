public class FibonacciSeries {

    static int fibonacci(int n){

        // base case
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args){

        int n = 15 ;

        for(int i = 1 ; i<=n ; i++){
            System.out.print(fibonacci(i) + "  ");
        }
    }
}
