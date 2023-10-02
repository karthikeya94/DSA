import java.util.*;
public class SelectionSort{
	public static void main(String[] args) {
        int[] a={6,3,7,2,6,1,0};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
    static void selectionSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int last = arr.length-i-1;
			int maxInd = getMaxInd(arr,0,last);
			int temp=arr[last];
			arr[last]=arr[maxInd];
			arr[maxInd]=temp;
		}
	}
	static int getMaxInd(int[] a,int s,int e){
		int max=s;
		for(int i=s;i<=e;i++){
			if(a[max]<a[i]){
				max=i;
			}
		}
		return max;
	}
}
