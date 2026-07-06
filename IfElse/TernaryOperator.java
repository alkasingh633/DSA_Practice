package IfElse;
import java.util.*;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int n = sc.nextInt();
		
		//condition ? true : false -> ternary ope
		System.out.println(n + " is " +((n%2==0) ? "Even" : "odd"));

	}

}
