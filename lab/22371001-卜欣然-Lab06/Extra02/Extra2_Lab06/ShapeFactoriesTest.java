package Extra2_Lab06;
import java.util.List;
import java.util.ArrayList;
public class ShapeFactoriesTest {
	public static void main(String[] args) {
		List<IShapeFactory> factory = new ArrayList<>();
		factory.add(new RectangleFactory());
		factory.add(new EllipseFactory());
		factory.add(new RhombusFactory());
		for(IShapeFactory element:factory) {
			System.out.println(element.makeShape(1.3, 1.9).calcArea());
		}
	}
	public static Shape makeShape(IShapeFactory factory, double a, double b) {
		return factory.makeShape(a, b);
	}
}
