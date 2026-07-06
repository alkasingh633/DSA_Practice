package IfElse;
import java.util.*;

public class TernaryInVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		
		int n = sc.nextInt();
		int m = (n>=0) ? 100 : 0;
		
		System.out.println(m);

	}

}
