// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Regular method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Implementing the abstract method
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound(); // Output: Dog barks
        d.eat(); // Output: This animal eats food.
    }
}
