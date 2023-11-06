package lab07_Q4;

public class Rhombus extends Shape{
    public double calcArea() {
        double c=0.5*getA()*getB();
        return c;
    }
    public String getType(){
        return "rhombus";
    }
    public Rhombus() { this(0.0, 0.0); }
    public Rhombus(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
