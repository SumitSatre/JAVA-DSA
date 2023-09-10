import java.util.Scanner;

public class StringBasic {
    public static void main(String[]args){

        // Ways to create string
        String str = "Sumit satre";
        // String s = new String("Hi");

        System.out.print("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();

        System.out.println(name);
        System.out.println(name.length());

        System.out.println(str + " " + name);

        System.out.println(str.charAt(8));

    }
}
