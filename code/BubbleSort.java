import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] a={6,3,7,2,6,1,0};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
    static void bubbleSort(int[] arr){
		boolean b=false;
		for(int i=0;i<arr.length;i++){
			b=false;
			for(int j=1;j<arr.length-i;j++){
				if(arr[j]<arr[j-1]){
					int temp =arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					b=true;
				}
			}
			if(!b){
				break;
			}
		}
	}
}
