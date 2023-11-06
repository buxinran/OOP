package Question6_Lab05;

import java.util.Date;

public class Executable extends file{
	fileType type=fileType.executable;
	public String toString() {
		return String.format(name+"'s content are as follows:\n"+content);
	}
	/*构造函数*/
	public Executable(String name,String time,int size,String content) {
		this.name=name;
		this.time=time;
		this.size=size;
		this.content=content;
		this.type=fileType.executable;
	}
}
