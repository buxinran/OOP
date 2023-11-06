package Extra3_Lab06;

public class RectangleFactory implements IShapeFactory {
	private static RectangleFactory factory=new RectangleFactory();
	public Shape makeShape(double a, double b) {
		if(a<0||b<0) {
			return null;
		}else {
			return new Rectangle(a,b);
		}
	}
	//getFactory
		public static RectangleFactory getFactory() {
			return factory;
		}
}
