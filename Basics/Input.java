import java.util.Scanner; 

public class Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two numbers : ");
        var a = sc.nextInt();
        int b = sc.nextInt();

        String p = a>b ? 
        a+" is greater" : 
        b+" is greater"; 

        System.out.println(p);

        System.out.println(Integer.MIN_VALUE);

        sc.close(); 
    }
} 