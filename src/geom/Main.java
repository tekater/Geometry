package geom;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();

        Triangle triangle = new Triangle();
        //triangle.base = 5;
        //triangle.height = 3;
        System.out.println("Triangle:\n" + "S = b * h/2" + "\nS= " + triangle.area(5,4) + "\n");
        Circle circle = new Circle();
        System.out.println(String.format("Circle:\n" + "S = PI * R^2\nS= %.2f\n ", circle.area(5)));
        Rectangle rectangle = new Rectangle();
        System.out.println("Rectangle:\n" + "S = w * h" + "\nS= " + rectangle.area(10,5) + "\n");
        Square square = new Square();
        System.out.println("Square:\n" + "S = s^2" + "\nS= " + square.area(10));
    }
}