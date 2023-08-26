public class BinomialCoefficient {
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int findBinomialCoefficient(int n , int r){

        int result = (factorial(n) / ( factorial(r) * factorial(n-r) )) ;
        return result;
    }

    public static void main(String []args){
        System.out.println("ans : " + findBinomialCoefficient(1, 1));
    }
}
