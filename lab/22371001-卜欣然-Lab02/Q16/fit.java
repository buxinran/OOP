package lab02;

public class fit {
	public static void main(String [] args) {
		//创建对象小王
		Person1 xiaowang=new Person1();
		xiaowang.weight=70;
		double x=25;
		//状态改变
		xiaowang.weight=Person1.keepfit(xiaowang.weight,x);
		System.out.println(xiaowang.weight);
	}
}
//类：人
class Person1{
	//属性：体重
	double weight;
	//行为：减肥
	public static double keepfit(double before,double x){
		return before-x;
	}
}
