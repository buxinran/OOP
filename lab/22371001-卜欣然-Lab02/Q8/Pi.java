package lab02;

import java.util.Scanner;
import static java.lang.Math.*;

public class Pi {
	/* 下面这种注释是 Java 中一种比较规范的注释，一般可以用 IDE 自动生成格式 */
	/**
	* 利用公式求指定精度的圆周率
	* 如果 n 是负数，视其为 0
	* @param n 公式中的 i 的上限
	* @return 圆周率的近似值
	*/
	public static void main(String [] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double pi=getPi(n);
		System.out.println(pi);
		in.close();
	}
	public static double getPi(int n){
		if(n<0)
			n=0;
		double pi=0.0;
		for(int i=0;i<=n;i++) {
			pi+=Math.pow(-1,i)/(2*i+1);
		}
		pi*=4;
		return pi;
	}
}
