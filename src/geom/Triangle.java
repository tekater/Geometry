package geom;

public class Triangle extends Shape{
    double height;
    double base;
    /*@Override
    public double area() {
        //System.out.println("S = b * h/2");
        return base * height/2;
    }*/
    public double area(double height, double base) {
        return base * height/2;
    }
}
