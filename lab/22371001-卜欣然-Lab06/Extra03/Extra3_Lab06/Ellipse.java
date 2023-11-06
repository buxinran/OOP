package Extra3_Lab06;
import static java.lang.Math.PI;
public class Ellipse extends Shape{
	public double calcArea() {
		double c=PI*getA()*getB();
		return c;
	}
	public Ellipse() { this(0.0, 0.0); }
	public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
        this.
    }
}
