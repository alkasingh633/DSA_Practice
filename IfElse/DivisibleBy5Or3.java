package IfElse;
import java.util.*;

// take a positive integer input and tell if it is divisible by 5 or 3

public class DivisibleBy5Or3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int n = sc.nextInt();
		
		
		
		if(n%5==0 || n%3==0)
			System.out.println("Divisible either by 5 or 3 or both");
		else
			System.out.println("not divisible by 5 or 3");
	}

}
