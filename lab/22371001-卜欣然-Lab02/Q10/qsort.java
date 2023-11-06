package lab02;
import java.util.Arrays;
import java.util.Scanner;
public class qsort {
	public static void main(String [] args) {
		int[] a= {12, 45, 67, 89, 123, -45, 67};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		Scanner in=new Scanner(System.in);
		int check=in.nextInt();
		int k=binsearch(a,a.length,check);
		if(k==-1) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		in.close();
	}
	public static int  binsearch(int key[ ], int n, int k){
	     int low=0, high=n-1, mid;
	     while(low<=high){
	        mid=(low+high)/2;
	        if(k==key[mid]) {
	        	return mid; 
	        }else if(k>key[mid]) {
	        	low=mid+1;
	        }else {
	        	high=mid-1;
	        }
	     }
	     return -1;                            
	}

}
