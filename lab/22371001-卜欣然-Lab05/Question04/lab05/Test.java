package lab05;

public class Test {
	public static void main(String[] args) {
		Rectangle a=new Rectangle();
		a.setA(1.5);
		a.setB(2.8);
		System.out.println(a.calcArea());
		Rhombus b=new Rhombus();
		b.setA(3.4);
		b.setB(2.1);
		System.out.println(b.calcArea());
		Ellipse c=new Ellipse();
		c.setA(19.3);
		c.setB(12.3);
		System.out.println(c.calcArea());
	}
}
