public class Practice {

    public static void print1(int i){
        if(i == 5){
            return;
        }

        System.out.println("Sumit");
        print1(i+1);
    }

    public static void print2(int i , int n){
        if(i == n){
            return;
        }

        System.out.print(i + " ");
        print2(i+1 , n);
    }

    public static void print3(int n){
        if(n == 0){
            return;
        }

        System.out.print(n + " ");
        print3(n-1);
    }

    public static void print4(int n){
        if(n == 0){
            return;
        }

        print4(n-1);
        System.out.print(n + " ");
    }

    public static void print5(int i , int n){
        if(i == n){
            return;
        }

        print5(i+1 , n);
        System.out.print(i + " ");
    }

    public static int sum(int sum , int i){
        if(i == 0){
            return sum;
        }

        return sum(sum+i , i-1);
    }

    public static void main (String[] args){
        print1(0);
        print2(0, 10);

        print3(10);
        System.out.println();

        print4(10);
        System.out.println();
        print5(0 , 10);
        System.out.println();

        System.out.println(sum(0 , 10));
    }   
}
