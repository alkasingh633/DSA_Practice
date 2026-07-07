package Arrays;
import java.util.*;

public class PrintNegativeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {3,-6,7,-1,5,9,-3};
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]<0) {
//				System.out.print(arr[i]+" ");
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of n : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("enter array element : ");
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i =0; i<n; i++) {
			if(arr[i]<0) {
				System.out.println("Negative value : ");
				System.out.print(arr[i]+" ");
			}
		}
		

	}

}
