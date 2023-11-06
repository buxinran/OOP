package Extra3_Lab06;

public class EllipseFactory implements IShapeFactory{
	private static EllipseFactory factory=new EllipseFactory();
	public Shape makeShape(double a, double b) {
		if(a<0||b<0) {
			return null;
		}else {
			return new Ellipse(a,b);
		}
	}
	//getFactory
	public static EllipseFactory getFactory() {
		return factory;
	}
}
