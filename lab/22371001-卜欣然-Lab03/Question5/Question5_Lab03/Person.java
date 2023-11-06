package Question5_Lab03;

public class Person {
	private String name;
	private int age;
	private String sex;
	public Person(String name,int age,String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void work() {
		System.out.println("working");
	}
	public void showAge() {
		System.out.println("Age="+age);
	}
}
