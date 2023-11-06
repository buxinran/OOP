package lab02;
public class strstr {
	public static void main(String [] args) {
		String output=strscat("a","b","c","","e");
		System.out.println(output);
		output=strscat("str");
		System.out.println(output);
	}
	/**
	* 将任意个字符串顺序连接，不应该改变任意一个原有参数
	* @param args 字符串们
	* @return args中的字符串顺序连接组成的新字符串
	*/
	public static String strscat(String... args){
		for(int i=1;i<args.length;i++) {
			args[0]=args[0]+args[i];
		}
		return args[0];
	}

}
