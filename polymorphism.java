
class Student {
    String name;
    int age;

    // multiple methods with same name but different parameters
    // compile time polymorphism
    // Method overloading: same method name, different parameters
    public void printinfo(String name) {
        System.out.println(name);
    }

    public void printinfo(int age) {
        System.out.println(age);
    }

    public void printinfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "jiya";
        s1.age = 24;

        // Calling overloaded methods
        s1.printinfo(s1.name); // prints: jiya
        s1.printinfo(s1.age); // prints: 24
        s1.printinfo(s1.name, s1.age); // prints: jiya 24
    }
}
