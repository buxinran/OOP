package Extra2_Lab06;
import java.util.Random;
public class ShapeFactory {
	enum ShapeType{
		Rhombus,Rectangle,Ellipse,
	}
	public static Shape makeShape(ShapeType type, double a, double b) {
		if(a<0||b<0) {
			return null;
		}
		if(type==ShapeType.Rhombus) {
			Shape shape=new Rhombus(a,b);
			return shape;
		}else if(type==ShapeType.Rectangle) {
			Shape shape=new Rectangle(a,b);
			return shape;
		}else{
			Shape shape=new Ellipse(a,b);
			return shape;
		}
	}
	public static Shape randomNextShape() {
		int r=new Random().nextInt()%3;
		if(r==0) {
			return new Rhombus(Math.random()*100,Math.random()*100);
		}else if(r==1) {
			return new Rectangle(Math.random()*100,Math.random()*100);
		}else {
			return new Ellipse(Math.random()*100,Math.random()*100);
		}
	}
}
