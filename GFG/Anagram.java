class Anagram{
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        int temp = 0;
        
        for (int i = 0 ; i<a.length() ; i++){
            temp = temp ^ a.charAt(i) ^ b.charAt(i);
        }

       if(temp == 0){
           return true;
       }
        
        return false;
    }

    public static void main(String []args){
       System.out.println(isAnagram("saurabh" , "saurahb"));
    }
}