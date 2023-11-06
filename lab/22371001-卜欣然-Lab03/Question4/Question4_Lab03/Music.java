package Question4_Lab03;

public class Music implements IMessage{
	private String name;
	private String type;
	public Music(String name,String type){
		this.name=name;
		this.type=type;
	}
	public void print() {
		System.out.println("音乐名称为"+name+",音乐类型为"+type+"。");
	}
}
