package Loop;
import java.util.*;

//display this AP 2,5,8,11.. upto n terms

public class PrintAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of n");
		int n = sc.nextInt();
		
		
		for(int i =2; i<=3*n-1; i+=3) {
			System.out.print(i +" ");
		}

	}

}
