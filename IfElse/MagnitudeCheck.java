package IfElse;
import java.util.*;

//take integer input and tell if its magnitude is smaller than 69 or not

public class MagnitudeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int n = sc.nextInt();
		if(n<0) {
			n=-n;
			System.out.println(n);
			if(n<69)
				System.out.println("magnitude smaller then 69");
			else
				System.out.println("greater then 69");
		}else {
			n=n;
		if(n<69)
			System.out.println("magnitude smaller then 69");
		else
			System.out.println("greater then 69");
	
		}

	}

}
