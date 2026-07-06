package IfElse;
import java.util.*;

public class GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 1st no. : ");
		int a = sc.nextInt();
		System.out.println("enter 2nd number");
		int b = sc.nextInt();
		System.out.println("enter 3rd number");
		int c  = sc.nextInt();
		if(a>=b && a>=c)
			System.out.println("a is greater");
		else if(b>=a && b>=c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");

	}

}
