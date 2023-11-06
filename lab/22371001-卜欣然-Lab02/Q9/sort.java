package lab02;

public class sort {
	public static void main(String [] args) {
		int[] a= {12, 45, 67, 89, 123, -45, 67};
		int[] b=qsort(a);
		for (int element: b) {
	         System.out.println(element);
	    }
	}
	/**
	* 对一个int数组快速排序，结果是升序的，并且不会开辟额外的数组空间
	* @param arr 待排序的数组
	* @return 升序排列好的 arr，如果 arr == null，则返回 null
	*/
	public static int[] qsort(int[] arr) {
		quick(arr,0,arr.length-1);
		return arr;
	}
	public static void quick(int[] arr,int left,int right) {
		int i, j;
	    int pivot;
	    if(left<right){
	    	i=left;
	    	j=right+1;
	        pivot = arr[left];
	        while(true){ 
	        	while(arr[++i]<pivot && i!=right) { }
	            while(arr[--j]>pivot && j!=left) { }
	            if(i<j) {
	            int swap=arr[i];
	            arr[i]=arr[j];
	            arr[j]=swap;
	            }else
	            	break;
	        }
	        int swap=arr[left];
	        arr[left]=arr[j];
	        arr[j]=swap;
	        quick(arr,left,j-1);      
	        quick(arr,j+1,right);     
	       }

	}
}
