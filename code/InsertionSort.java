import java.util.*;
public class InsertionSort{
	public static void main(String[] args) {
		int[] a={6,3,7,2,6,1,0};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
	}
	static void insertionSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j>0;j--){
				if(a[j]<a[j-1]){
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}else{
					break;
				}
			}
		}				
	}	
}
