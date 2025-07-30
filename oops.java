
class Pen {
    // propertiesof the class
    String color;
    String type;

    // fuction to write -- something
    public void write() {
        System.out.println("writing something");
    }

    public void printinfo() {
        // this - is used to call the methods- color and type
        System.out.println(this.color);
        System.out.println(this.type);
    }

    Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }
}

public class oops {
    public static void main(String args[]) {
        Pen pen1 = new Pen("blue", "ball");
        // pen1 calling the print info function tht contains their own functions to

        pen1.printinfo();
    }
}
