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
		Shape[] ShapeList = new Shape[5];
		ShapeList[0]=ShapeFactory.randomNextShape();
		ShapeList[1]=ShapeFactory.randomNextShape();
		ShapeList[2]=ShapeFactory.randomNextShape();
		ShapeList[3]=ShapeFactory.makeShape(ShapeFactory.ShapeType.Ellipse,1.0,2.5);
		ShapeList[4]=ShapeFactory.makeShape(ShapeFactory.ShapeType.Rectangle,3.7,1.4);
		for(Shape element:ShapeList) {
			System.out.println(element.calcArea());
		}
	}
}
