public class FunctionOverloading {
    static void greet(String name) {  
        System.out.println("Good Morning, " + name + "!!");  
    }

    static void greet(String name , String name2) {  
        System.out.println("Good Morning, " + name + " and "+name2+"!!");  
    }

    public static void main(String[] args) {
        greet("Sumit");  
        greet("Sumit","Saurabh");
    }
}
