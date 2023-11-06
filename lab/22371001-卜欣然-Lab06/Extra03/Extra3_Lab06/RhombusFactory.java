package Extra3_Lab06;

public class RhombusFactory implements IShapeFactory{
	private static RhombusFactory factory=new RhombusFactory();
	public Shape makeShape(double a, double b) {
		if(a<0||b<0) {
			return null;
		}else {
			return new Ellipse(a,b);
		}
	}
	//getFactory
		public static RhombusFactory getFactory() {
			return factory;
		}
}
