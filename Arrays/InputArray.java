package Arrays;
import java.util.*;

public class InputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
		int[] arr = new int[7];
		
		//default values
		for(int i=0; i<7; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//taking input
		for(int i=0; i<7; i++) {
			arr[i]  = sc.nextInt();
		}
		//print
		for(int i=0; i<7; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
