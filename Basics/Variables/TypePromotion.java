public class TypePromotion {
    public static void main(String[] args){
        // byte a = 15;
        // char b = 'b';
        // short c = 45;
// 
        // int result = a+b+c;  

        int a = 45;
        byte b = 1;
        long l = 56;
        double d = 45.22;
        // boolean c = (5>2) ? true : false;

    /*  long result = a+b+l+d; -> it gives error because the result is double
         and we cannot store it in long */

        double result = a+b+l+d;
        System.out.println(result); 
        
    }
}


