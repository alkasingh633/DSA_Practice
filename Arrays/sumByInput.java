package Arrays;
import java.util.*;

public class sumByInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter value of n : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("enter array element : ");
		for(int i =0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum =0;
		for(int i =0; i<n; i++) {
			sum += arr[i];
		}
      System.out.println("sum = "+ sum);
	}

}
