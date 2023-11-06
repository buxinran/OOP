package lab05;
import static java.lang.Math.PI;
public class Ellipse extends Shape{
	public double calcArea() {
		double c=PI*getA()*getB();
		return c;
	}
}
