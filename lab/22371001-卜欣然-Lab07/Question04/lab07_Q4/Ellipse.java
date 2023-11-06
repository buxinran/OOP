package lab07_Q4;

import static java.lang.Math.PI;
public class Ellipse extends Shape{
    public double calcArea() {
        double c=PI*getA()*getB();
        return c;
    }
    public String getType(){
        return "ellipse";
    }
    public Ellipse() { }
    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
