package IfElse;
import java.util.*;

public class divisibleByFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		
		int num = sc.nextInt();
		
		if(num %10==0 || num % 10 == 5) {
			System.out.println("divisible by 5");
		}else {
			System.out.println("not divisible by 5");
		}

	}

}
