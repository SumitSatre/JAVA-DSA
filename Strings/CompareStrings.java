public class CompareStrings {
    
    public static void main(String [] args){

        String s1 = "Sumit";
        String s2 = "Sumit";
        String s3 = new String("Sumit");

        if(s1 == s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s1 == s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        // This check values of both s1 and s3 and compare
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
