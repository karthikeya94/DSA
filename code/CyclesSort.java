import java.util.*;
public class CyclesSort{
	//use cycle sort only when array in range of 1 to n
	public static void main(String[] args) {
		int[] a={5,3,4,2,1};
        cycleSort(a);
        System.out.println(Arrays.toString(a));
    }
    static void cycleSort(int[] a){
		int i=0;
		while(i<a.length){
			int correct = a[i]-1;
			if(a[i]!=a[correct]){
				int t=a[i];
				a[i]=a[correct];
				a[correct]=t;
			}else{
				i++;
			}
		}
	}
}
