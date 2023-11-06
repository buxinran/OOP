package Question4_Lab03;

public class Mobile implements IMessage{
	private String brand;
	private String mobileNumber;
	public Mobile(String brand,String mobileNumber){
		this.brand=brand;
		this.mobileNumber=mobileNumber;
	}
	public void print() {
		System.out.println("手机品牌为"+brand+",手机型号为"+mobileNumber+"。");
	}
}
