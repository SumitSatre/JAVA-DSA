class Animal{
    Animal(){
        System.out.println("Animal is called...");
    }

    String color ;

    void eat(){
        System.out.println("eats");
    }

    void walk(){
        System.out.println("walk");
    }
}

class dog extends Animal{
    dog(){
        System.out.println("dog is called...");
    }

    String smell;

    void walkSpeed(){
        System.out.println("very fast");
    }
}

class Inheritance {
    public static void main(String[] args){ 
        dog d = new dog();
        d.walk();
    }
}