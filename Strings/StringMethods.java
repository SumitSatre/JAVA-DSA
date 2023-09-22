class StringMethods{
    public static void main(String[] args){
        String s = "SuMit";

        System.out.println("Length is : " + s.length());

        System.out.println("lower case is : " + s.toLowerCase());

        System.out.println("upper case is : " + s.toUpperCase());

        // str.trim() removes all leading and trailing spaces
        String nontrimmed = "              str              ";
        System.out.println("After trim : " + nontrimmed.trim());

        // This will print substring from index to index or from index

        // In this start index is included but end undex is excluded
        System.out.println("sub string is : " + s.substring(1 , 3));

        // this will return string from start index to end
        System.out.println("sub string is : " + s.substring(1));

        // str.replace(old char:'' , new char:''); used to replace old char to new char
        System.out.println("After replace is : " + s.replace('S' , 'c'));

    // str.startsWith(String:"") return boolean check wheather start with entered string or not
        System.out.println("Is start with this : " + s.startsWith("S"));

        // str.endsWith(String:"") return boolean check wheather end with entered string or not
        System.out.println("Is end with this : " + s.endsWith("g"));

        // str.charAt(index:5) most imp method used to get particular index character in String
        System.out.println("at index : " + s.charAt(2));

        String str = "My name is Sumit. Sumit Satre";
    // str.indexOf(String:"")method is used to find the index of a substring within a string
    // if not not present return -1
        System.out.println("index of : " + str.indexOf("it" ));

        // Starts finding from index 15
        System.out.println("index of : " + str.indexOf("it" , 15));

        // find at last
        System.out.println("index of : " + str.lastIndexOf("it"));

        // This find upto index 5
        System.out.println("index of : " + str.lastIndexOf("it" , 5));

        System.out.println("is equal : " + s.equals("Sumit"));  // true == SuMit
        System.out.println("is equal : " + s.equalsIgnoreCase("sumit"));
    }
}