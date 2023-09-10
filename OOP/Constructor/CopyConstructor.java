class CopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Sumit";
        s1.pwd = "ankdd";

        Student s2 = new Student(s1);
        System.out.println(s2.name + "\t" + s2.pwd);

        s1.name = "Saurabh";

        System.out.println(s2.name + "\t" + s2.pwd);
    }
}

class Student {
    String name;
    String pwd;

    // Default (no-argument) constructor
    Student() {
    }

    Student(String name) {
        this.name = name;
    }

    // Copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.pwd = s1.pwd;
    }
}
