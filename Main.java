import java.util.ArrayList;
import java.util.HashSet;

public class Main{
/*
    public static String getWord(String[] arr){
        HashSet<String> set = new HashSet<>();

        StringBuilderMethods res = new StringBuilderMethods();

        for (int i = 0; i < arr.length; i++) {
            res.append(arr[i].charAt(0)).append(arr[i].charAt(2));

            set.add(res.toString());
            res.setLength(0);;
        }

        for(String str : set){
            System.out.println(str);
        }

        return "l";
    }
    

    public static boolean checkIsContains(HashSet<String> set , String part){
       
        for(String str : set){
            if(str.startsWith(part) || str.endsWith(part)){
                return true;
            }
        }

    }
    */

    public static void main(String[] args){

        String arr[] = { "O>T" , "K>O" , "L>I" , "I>N" , "T>L"};

        String a[] = { "E>R" , "R>U" , "P>E"};

        // System.out.println( getWord(arr) ); 

        System.out.println( getOneWord(arr) );  // output : KOTLIN

        System.out.println( getOneWord(a) );  // output : PERU

    }

    public static String getOneWord(String[] arr){
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0 ; i < arr.length ; i++){
            result.add( Character.toString( arr[i].charAt(0) ) + Character.toString( arr[i].charAt(2) ) );
        }
        
        while(result.size() != 1){
            String str1 = result.get(0);
            //System.out.println(str1);
            
            int i = 1 ;
            while(i< result.size()){
                String str2 = result.get(i);
                // System.out.println(str2);

                if(str1.charAt(0) == str2.charAt(1)){
                    result.remove(i);
                    result.set(0 , Character.toString(str2.charAt(0)) + str1 );
                    break;
                }
                else if(str1.charAt(str1.length() - 1) == str2.charAt(0) ){
                    result.remove(i);
                    result.set(0 , str1 + Character.toString(str2.charAt(1)) );
                    break;
                }
                i++;
            }

            for(int j = 0 ; j < result.size() ; j++){
                // System.out.print(result.get(j) + " ");
            }
            //System.out.println();
        }

        return result.get(0);
    }
}


/*
 * 
 * 100351. Alternating Groups II
User Accepted:4120
User Tried:8546
Total Accepted:4201
Total Submissions:15493
Difficulty:Medium
There is a circle of red and blue tiles. You are given an array of integers colors and an integer k. The color of tile i is represented by colors[i]:

colors[i] == 0 means that tile i is red.
colors[i] == 1 means that tile i is blue.
An alternating group is every k contiguous tiles in the circle with alternating colors (each tile in the group except the first and last one has a different color from its left and right tiles).

Return the number of alternating groups.

Note that since colors represents a circle, the first and the last tiles are considered to be next to each other.

 

Example 1:

Input: colors = [0,1,0,1,0], k = 3

Output: 3

Explanation:



Alternating groups:



Example 2:

Input: colors = [0,1,0,0,1,0,1], k = 6

Output: 2

Explanation:



Alternating groups:



Example 3:

Input: colors = [1,1,0,1], k = 4

Output: 0

Explanation:



 

Constraints:

3 <= colors.length <= 105
0 <= colors[i] <= 1
3 <= k <= colors.length
Java	
1
class Solution {
2
    public int numberOfAlternatingGroups(int[] colors, int k) {
3
        int result = 0;
4
        int lastFault = -1;
5
        int val = 0;
6
        
7
        int i = 0 , j = 0;
8
        
9
        while(i < colors.length){
10
            if(j-i+1 == k){
11
                if(lastFault <= i){
12
                    result++;
13
                }
14
                i++;
15
            }
16
            else if(j < i){
17
                result++;
18
                i++;
19
            }
20
            boolean check = check(colors , j);
21
            if(!check){
22
                if(val == 1){
23
                    lastFault = j + n; 
24
                }
25
                else{
26
                    lastFault = j;
27
                }
28
            }
29
            // System.out.println(lastFault);
30
            if(j == colors.length){
31
                val = 1;
32
            }
33
            j = (j+1) % colors.length;
34
        }
35
        
36
        return result-1;
37
    }
38
    
39
    public static boolean check(int[] colors , int i){
40
        
41
        int left = i == 0 ? colors.length-1 : i-1;
42
        int right = i == colors.length-1 ? 0 : i+1;
43
        
44
        if(colors[i] != colors[left] && colors[i] != colors[right]){
45
            return true;
46
        }
47
        return false;
48
    }
49
}
  Custom Testcase
Copyright © 2024 LeetCode
Help Center
Jobs
Bug Bounty
Online Interview
Students
Terms
Privacy Policy
United StatesUn
 */