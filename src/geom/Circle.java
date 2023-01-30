package geom;

public class Circle extends Shape{
    double radius;

    /*@Override
    public double area() {
        System.out.println("S = PI * R^2");
        return Math.PI * Math.pow(radius,2);
    }*/
    public double area(double radius) {
        return Math.PI * Math.pow(radius,2);
    }
}
