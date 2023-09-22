//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class PrintPattern{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine().trim());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.pattern(N);
            for(int i = 0;i < ans.size();i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> result = new ArrayList<>();
    static int index = 0;
    static int k = -5;
    static int flag = 0;
    
    static void createPattern(int n , int i){
        
        if (n == i) {

        if (flag == 1) {
            result.add(n);
            return;
        }

        flag = 1;

    }
        
        result.add(n);
        
        if(n<=0){
            k = 5;
        }
        
        createPattern(n+k , i);
        
    }

    List<Integer> pattern(int N) {
        createPattern(N , N);
        return result;
    }
}