package IfElse;
import java.util.*;

// take positive integer input and tell if it is four digit
// digit numbers or not.

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number : ");
		int n = sc.nextInt();
		
		if(n >999 && n<10000)
			System.out.println("positive four digit number");
		else
			System.out.println("not positive four digit number");
			
		
		
		

	}

}
