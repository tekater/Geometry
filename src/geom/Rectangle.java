package geom;

public class Rectangle extends Shape{
    double width;
    double height;

    /*@Override
    public double area() {
        System.out.println("S = w * h");
        return width * height;
    }*/
    public double area(double width,double height) {
        return width * height;
    }
}
