public class Basic{   

    public static int getCount(String word , String sentence){
        int n = word.length();
        int k = 0;
        String let = "";
        int count = 0;

        while(k < sentence.length()){
            let += sentence.charAt(k);
            if(sentence.charAt(k) == ' ' || k == sentence.length()-1 ){
                let = let.trim();
                if(let.length() == n){
                    for(int j = 0 ; j<n ; j++){
                        if(let.charAt(j) == word.charAt(j)){
                            count++;
                        }
                    }
                }

                let = "";
            }
            k++;
        }

        return count;
    }

    public static void getSentence(String word , String[] sentences){
        int result[] = new int[sentences.length];

        for(int i = 0 ; i< sentences.length ; i++){
            result[i] = getCount( word ,  sentences[i]);
        }

        
    }    

    public static void main(String[] args){
        System.out.println(getCount("cat" , "The cat sat on the mat"));
    }
}

