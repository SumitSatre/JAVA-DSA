public class ConstructorOverloading {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Sumit");
        Student s3 = new Student(45);
    }
}

class Student{
    
    Student(){
        System.out.println("constructor is called...");
    }

    Student(String name){
        System.out.println("Hello " + name);
    }

    Student(int rollNo){
        System.out.println("rollNo is : "+ rollNo);
    }
} 
