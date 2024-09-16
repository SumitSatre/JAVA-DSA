public class Solution2 {
    public static void main(String[] args) {
        
    }

    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }

        if(n <= 3){
            return true;
        }

        if(n % 2 == 0 || n%3 == 0){
            return false;
        }

        for(int i = 5 ; i < Math.sqrt(n); i = i+2){
            if(n%i == 0) return false;
        }

        return true;
    }
}