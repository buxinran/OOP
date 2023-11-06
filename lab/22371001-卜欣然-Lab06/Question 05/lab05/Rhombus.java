package lab05;

public class Rhombus extends Shape{
	public double calcArea() {
		double c=getA()*getB();
		return c;
	}
	public Rhombus() { this(0.0, 0.0); }
	public Rhombus(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
