package Question6_Lab05;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Test {
	public static void main(String[] args) {
		Date dNow0=new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		Folder a=new Folder("java",ft.format(dNow0),2,"aaabbb");
		System.out.println(a.toString());
		Date dNow1=new Date();
		Executable b=new Executable("file.java",ft.format(dNow1),3,"siaoidhafoihi");
		Shortcut c=new Shortcut("lab05",ft.format(dNow1),4,"asiafifh",b);
		a.addNewfile(c,c.name);
		System.out.println(c.toString());
		System.out.println(b.toString());
		Date dNow2=new Date();
		Nonexecutable d=new Nonexecutable("non.java",ft.format(dNow2),5,"111111111111222222",false);
		a.addNewfile(d,d.name);
		System.out.println(d.toString());
		Date dNow3=new Date();
		Folder e=new Folder("lab1",ft.format(dNow3),2,"aaabbbccc");
		a.addNewfile(d,d.name);
		System.out.println(e.toString());
		Date dNow4=new Date();
		Nonexecutable f=new Nonexecutable("yes.java",ft.format(dNow4),10,"abcd222",true);
		a.addNewfile(f,f.name);
		System.out.println(f.toString());
		a.checkFile();
	}
}
