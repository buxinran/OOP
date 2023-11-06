package Question6_Lab05;
import java.util.Date;
public abstract class file {
	protected String name;
	protected String time;
	protected int size;
	protected String content;
	protected String path="C:/";
	protected Folder location=null; 
	protected boolean dele=false;
	enum fileType{
		folder,shortcut,executable,nonexecutable
	}
	public void delete() {
		dele=true;
	}
	public void judgeOpen() {
		System.out.println(content);
	}
	public abstract String toString();
}
