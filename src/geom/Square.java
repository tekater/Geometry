package geom;

public class Square extends Shape{
    double side;

    /*@Override
    public double area() {
        System.out.println("S = s^2");
        return Math.pow(side,2);
    }*/
    public double area(double side) {
        return Math.pow(side,2);
    }
}
