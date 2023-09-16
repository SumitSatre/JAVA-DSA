import java.util.Arrays;

class RemoveDuplicateFromString{
    public static void main(String[] args){
        String str = "apnnacollege" , result = "";
        boolean arr[] = new boolean[26]; 
        Arrays.fill(arr , false);

        for(int i = 0 ; i<str.length() ; i++){
            int ch = str.charAt(i);

            if(!arr[ch - 97]){
                result += str.charAt(i);
                arr[ch - 97] = true;
            }
        }

        System.out.println(result);

    }
}