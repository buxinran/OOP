package Question6_Lab05;

import java.util.Date;

public class Nonexecutable extends file{
	fileType type=fileType.nonexecutable;
	private String openStyle=null;
	private boolean open=false;
	public String toString() {
		return String.format(name+" can"+(open?"":" not")+" open.");
	}
	/*setter openStyle*/
	public void setOpenStyle(String openStyle) {
		this.openStyle=openStyle;
	}
	/*open*/
	public void judgeOpen() {
		if(openStyle==null) {
			System.out.println("Can not open successfully!");
			open=false;
		}else {
			System.out.println("Open successfully!");
			open=true;
		}
	}
	/*构造函数*/
	public Nonexecutable(String name,String time,int size,String content,boolean open) {
		this.name=name;
		this.time=time;
		this.size=size;
		this.content=content;
		this.open=open;
		this.type=fileType.nonexecutable;
	}
}
