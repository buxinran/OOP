package lab02;

import java.util.Scanner;

public class star {
	public static void main(String [] args) {
		Scanner in=new Scanner(System.in);
		int cnt=in.nextInt();
		int i,j;
		for(i=1;i<=cnt;i+=2) {
			for(j=0;j<(cnt-i)/2;j++) {
				System.out.print(" ");
			}
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=cnt-2;i>=1;i-=2) {
			for(j=0;j<(cnt-i)/2;j++) {
				System.out.print(" ");
			}
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
