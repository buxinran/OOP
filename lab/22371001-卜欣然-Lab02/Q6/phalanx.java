package lab02;
import java.util.Scanner;
public class phalanx {
	public static void main(String [] args) {
		Scanner in=new Scanner(System.in);
		int cnt=in.nextInt();
		int number=1;
		//System.out.println(cnt);
		int i,j;
		for(i=0;i<cnt;i++) {
			for(j=0;j<cnt;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println("\n");
		}
	}
}
