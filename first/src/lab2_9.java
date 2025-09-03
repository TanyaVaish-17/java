class Shape1 {
    void draw() {
        System.out.println("Drawing a Shape1");
    }
    void erase() {
        System.out.println("Erasing a Shape1");
    }
}
class Circle1 extends Shape1 {
    @Override
    void draw() {
        System.out.println("Drawing a Circle1");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Circle1");
    }
}
class Triangle extends Shape1 {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }
    @Override
    void erase() {
        System.out.println("Erasing a Triangle");
    }
}
class Square extends Shape1 {
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
    @Override
    void erase() {
        System.out.println("Erasing a Square");
    }
}
public class lab2_9 {
    public static void main(String[] args) {
        Shape1 s;
        s = new Circle1();
        s.draw();
        s.erase();
        s = new Triangle();
        s.draw();
        s.erase();
        s = new Square();
        s.draw();
        s.erase();
    }
}
