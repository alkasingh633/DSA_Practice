package IfElse;
import java.util.*;

//take positive integer input and print
// if no is divisible by 5
// -   -  -     -      - 3
// -   -  -    -       -  5 and 3 both
// -    -  -    not divisible by 5 or 3

public class CheckDivisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		
		int n = sc.nextInt();
		
		if(n%5==0 && n%3==0)
			System.out.println("divisible by 5 and 3");
		else if(n%5==0) 
			System.out.println("divisible by 5");
		else if(n%3==0)
			System.out.println("divisible by 3");
		 
		else 
			System.out.println("not divisible by both");
		

		

	}

}
