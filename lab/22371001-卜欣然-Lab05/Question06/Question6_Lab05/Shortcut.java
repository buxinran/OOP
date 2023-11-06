package Question6_Lab05;

import java.util.Date;

public class Shortcut extends file{
	fileType type=fileType.shortcut;
	private file link;
	public String toString() {
		return String.format(name+"'s size is "+size+",and it is located in "+path+".\nIt contains the file named "+link.name);
	}
	/*setter name*/
	public void setNames(String name) {
		String re1 = "*.lnk";
		if(name.matches(re1)) {
			this.name=name;
			System.out.println("Name success!");
		}else {
			System.out.println("This name is illegal!");
		}
	}
	/*getter link*/
	public file getLink() {
		return this.link;
	}
	/*open shortcut*/
	public void openShortcut(){
		if(dele==false) {
			System.out.println(link.toString());
		}
	}
	/*构造函数*/
	public Shortcut(String name,String time,int size,String content,file link) {
		this.name=name;
		this.time=time;
		this.size=size;
		this.content=content;
		this.link=link;
		this.type=fileType.shortcut;
	}
}
