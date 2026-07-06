package IfElse;
import java.util.*;

//take 3 positive integers input and tell if they can be the sides of a 
// triangle or not

public class SidesOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 1st side: ");
		int a = sc.nextInt();
		
		System.out.println("enter 2nd side: ");
		int b = sc.nextInt();
		
		System.out.println("enter 3rd side : ");
		int c = sc.nextInt();
		
		if(a+b>c && b+c>a && c+a>b)
			System.out.println("a, b, c are sides of triangle");
		else
			System.out.println("a,b,c are not sides of triangle");

	} 

}
