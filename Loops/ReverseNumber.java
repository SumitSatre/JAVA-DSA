import java.util.*;

public class ReverseNumber{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();
        int result=0 ;

        while(a!=0){ 
            int r = a % 10 ;          // r == remainder
            a = a / 10;

            result = r + 10 * result;
        }

        System.out.println("Reversed number : " + result);
    }
}
