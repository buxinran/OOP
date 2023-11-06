package lab07_Q4;

public class Rectangle extends Shape{
    public double calcArea() {
        double c=getA()*getB();
        return c;
    }
    public String getType(){
        return "rectangle";
    }
    public Rectangle() { this(0.0, 0.0); }
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
