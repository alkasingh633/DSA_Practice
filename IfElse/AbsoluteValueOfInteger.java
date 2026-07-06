package IfElse;
import java.util.*;

public class AbsoluteValueOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int n = sc.nextInt();
		if(n<0)
			n = -n;
		System.out.println(n);
//		if(n>=0)
//			System.out.println(n);
//		else
//			System.out.println(-n);

	}

}
