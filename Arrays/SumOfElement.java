package Arrays;
import java.util.*; 
//print sum of element of the array

public class SumOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5,-8, 6,3,2};
//		int sum = arr[0]+arr[1]+arr[2];
//		System.out.println("sum of array : "+ sum);

		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.print(sum);
		
	}

}
