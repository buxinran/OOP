package Question6_Lab05;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Folder extends file{
	private int layer=0;
	private int size=0;
	private Map<String, file> map = new HashMap<>();
	fileType type=fileType.folder;
	public String toString() {
		return String.format("This folder's size is "+size+",and has "+map.size()+" files.\n"+"It is located in "+path+".");
	}
	/*构造函数*/
	public Folder(String name,String time,int size,String content) {
		this.name=name;
		this.time=time;
		this.size=size;
		this.content=content;
		this.path=this.path+name+"//";
	}
	/*add new file*/
	public void addNewfile(file file,String name) {
		if(map.containsValue(file)) {
			System.out.println("Already has this file.");
		}else {
			map.put(name, file);
			this.size+=file.size;
			file.location=this;
			file.path=this.path+file.name+"//";
			System.out.println("Add success!");
		}
	}
	/*delete file*/
	public void deleteFile(file file) {
		if(map.containsKey(file.name)) {
			map.remove(file.name);
			System.out.println("Delete success!");
		}else {
			System.out.println("Can not find this file!");
		}
	}
	
	/*check folder's file*/
	public void checkFile() {
		for (Map.Entry<String, file> entry : map.entrySet()) {
		    System.out.println("The file's name is " + entry.getKey() + " ." + entry.getValue());
		}
	}
}
