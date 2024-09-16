import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == '1'){
                count++;
            }
            else{
                if(count == 0) continue;

                char ch = (char)('A' + count - 1);
                result.append(ch);
                count = 0;
            }
        }

        System.out.println(result.toString());
    }    
}
