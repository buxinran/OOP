package Question5_Lab03;

public class TestPerson {
	public static void main(String [] args) {
		Person mr=new Person("张三",18,"男");
		mr.setAge(19);
		mr.getAge();
		mr.showAge();
		Person miss=new Person("李四",21,"女");
		miss.setAge(48);
		miss.getAge();
		miss.showAge();
	}
}
