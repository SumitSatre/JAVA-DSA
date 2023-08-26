import java.util.*;

public class pattern {

    static void pattern1(int n){
        
        for(int i = 0 ; i<n ; i++){
            
            for(int j = 0 ; j< n-i-1 ; j++){
                System.out.print(" ");
            }

            for(int k = 0 ; k<=i ; k++){
                System.out.print("*");
            }

            for(int k = 0 ; k<i ; k++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();
        sc.close();

        pattern1(n);
    }
}
