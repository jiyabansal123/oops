public class inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "bruci";
        d1.eat();
        d1.bark();
    }

}

// Parent class (Super class)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class (Sub class)
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}