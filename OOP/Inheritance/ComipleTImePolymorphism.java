class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

class ComipleTImePolymorphism {
    public static void main(String[] args){ 
        Dog d = new Dog();
        d.makeSound();
    }
}

