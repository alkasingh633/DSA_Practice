package IfElse;
import java.util.*;

public class CheckInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number:");
		double n = sc.nextDouble();
		int x = (int)n;
		if(n-x>0)
			System.out.println("not integer");
		else
			System.out.println("is an integer");
	}

}
 