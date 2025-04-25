abstract class Shape {
    int a, b;

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void printArea() {
        System.out.println("Rectangle Area: " + (a * b));
    }
}

class Triangle extends Shape {
    Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void printArea() {
        System.out.println("Triangle Area: " + (0.5 * a * b));
    }
}

class Circle extends Shape {
    Circle(int r) {
        this.a = r;  // only use 'a' for radius
    }

    void printArea() {
        System.out.println("Circle Area: " + (Math.PI * a * a));
    }
}

public class Main {
    public static void main(String[] args) {
        Shape r = new Rectangle(5, 10);
        Shape t = new Triangle(5, 8);
        Shape c = new Circle(7);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
