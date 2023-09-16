abstract class Animal{
    Animal(){
        System.out.println("Animal is called...");
    }
    void eat(){
        System.out.println("eats\n");
    };

    abstract void walkSpeed();
}

class Dog extends Animal{
    static {
        // This block of code will run when the class is loaded
        System.out.println("Static block is executed.");
        // You can put any code you want here
        }
        
    Dog(){
        System.out.println("Dog is called...");
    }

    void walkSpeed(){
        System.out.println("very fast");
    }
}
    
public class Abstraction {
    public static void main(String[] args){ 
        Dog d = new Dog();
        d.walkSpeed();
        d.eat();

        Dog puppy = new Dog();
        d.walkSpeed();
    }
}
