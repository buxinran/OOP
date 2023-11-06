package lab03;
import java.util.Scanner; 
public class Check {
	public static void main(String [] args) {
		Scanner in=new Scanner(System.in);
		String input=in.nextLine();
		char []num=input.toCharArray();
		//flag用于判断是否是前导 0 的无符号整数，0是否，1为是。
		int flag=0,i;
		for(i=0;i<num.length&&num[i]=='0';i++);
		if(i==0) {
			flag=1;
			for(int j=0;j<num.length;j++) {
				if(!(Character.isDigit(num[j])||Character.isWhitespace(num[j]))) {
					flag=0;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println(input+"不是无前导0的无符号整数，不能用于判断是否是回文数");
			System.exit(0);
		}else {
			for(int j=0;j<num.length;j++) {
				if(Character.isWhitespace(num[j])) {
					System.out.println(input+"是没有前导0的无符号整数，但不是回文数，因为其含有其他字符。");
					System.exit(0);
				}
			}
			for(int j=0,k=num.length-1;j<num.length;j++,k--) {
				if(num[j]!=num[k]) {
					System.out.println(input+"是没有前导0的无符号整数，但不是回文数。");
					System.exit(0);
				}
			}
			System.out.println(input+"是回文数。");
		}
	}
}
