public class Pallindrome {
    
    public static boolean checkPallindromeStr(String str){

        for(int i = 0 , j = str.length()-1 ; i<j ; i++,j-- ){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[]args){

        String str = "madam";

        System.out.println( checkPallindromeStr(str) );

    }
}
