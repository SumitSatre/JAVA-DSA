public class SubString {
    
    public static String CreateSubstring(String str , int start , int end){
        
        String temp = "";

        for(int i = start ; i < end ; i++){
            temp = temp+str.charAt(i);
        }

        return temp;
    }

    public static void main(String[]args){

        String str = "Sumit Satre";
        System.out.println(str.length());

        System.out.println( CreateSubstring(str , 6 , 11) );

        // In built sub String function
        System.out.println( str.substring(0, 5) );

        String a = '0'*3;

    }
}
