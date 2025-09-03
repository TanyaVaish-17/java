abstract class Shape {
    abstract void draw();
    void area(int side) {
        System.out.println("Area of Square = " + (side * side));
    }
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
    void area(double radius) {
        System.out.println("Area of Circle1 = " + (3.14 * radius * radius));
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle1");
    }
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
public class lab3_11 {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.draw();
        s = new Rectangle();
        s.draw();
        s.area(5);
        s.area(5, 10);
        s.area(3.0);
    }
}
