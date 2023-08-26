import java.lang.Math;

public class CkeckPrime {
    public static boolean isPrime(int n){
        for(int i =2 ; i<= Math.sqrt(n) ; i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
        
        for(int i=2 ; i<=20 ; i++){
            if(isPrime(i)){
                System.out.println(i+" is a prime number");
            } 
        }
    }
}
