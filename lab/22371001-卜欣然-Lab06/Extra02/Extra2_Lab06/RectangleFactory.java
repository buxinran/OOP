package Extra2_Lab06;

public class RectangleFactory implements IShapeFactory {
	public Shape makeShape(double a, double b) {
		if(a<0||b<0) {
			return null;
		}else {
			return new Rectangle(a,b);
		}
	}
}
