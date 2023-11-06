package Extra3_Lab06;

public class Rectangle extends Shape{
	public double calcArea() {
		double c=getA()*getB();
		return c;
	}
	public Rectangle() { this(0.0, 0.0); }
	public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
