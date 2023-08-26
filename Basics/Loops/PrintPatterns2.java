public class PrintPatterns2{

    static void pattern1(int n){
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");
    }

    static void pattern2(int n){
        for(int i = 0 ; i<n ; i++){
            for(int j = n-i ; j>0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");
    }

    static void pattern3(int n){

        for(int i = 0 ; i<n ; i++){
            int k = 1;
            for(int j = 0 ; j<=i ; j++){
                System.out.print(k++);
            }
            System.out.println();
        }

        System.out.println("\n");
    }

    static void pattern4(int n){
        
        int k = 'A'; 
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<=i ; j++){
                System.out.print((char)k++);
            }
            System.out.println();
        }

        System.out.println("\n");
    }

    public static void main(String args[]){
        int n= 5;
        pattern1(n);

        pattern2(n);

        pattern3(n);

        pattern4(n);
    }
}
