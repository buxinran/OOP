package Question5_lab05;

public class Test {
	public static void main(String[] args) {
		/*构造几种交通工具*/
		Vehicle motor=new Motorbike();
		motor.setCnt(2);
		Vehicle car=new Car();
		car.setCnt(4);
		System.out.println(car.toString());
		Vehicle tank=new Tank();
		tank.setCnt(8);
		System.out.println(tank.toString());
		/*结合motor bike实现特定场景*/
		Person sister=new Person();
		sister.setName("sister");
		Person brother=new Person();
		brother.setName("brother");
		Motorbike motorbike=new Motorbike();
		motorbike.setCnt(2);
		motorbike.setDriver(brother);
		motorbike.setPassenger(sister);
		System.out.println(motorbike.toString());
		sister.say();
	}
}
