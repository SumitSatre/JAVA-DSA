//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int prefix[] = new int[n];
        
        prefix[0] = arr[0]; 
        
        for(int i = 1 ; i<n ;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        
        for (int start  = 0 ; start<n ; start++){
            for (int end  = 0 ; end<n ; end++){
                int sum = start == 0 ? arr[end] : arr[end] - arr[start-1];
                
                if(sum == s){
                    result.add(start);
                    result.add(end);
                    return result;
                }
            }
        }
        
        result.add(-1);
        return result;
        
    }
}