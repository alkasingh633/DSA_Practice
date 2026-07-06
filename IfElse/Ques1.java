package IfElse;
import java.util.*;

// if cp and sp of an item is input through the keyboard, write
// a program to determone whether the seller has made profit or
// incurred loss or no profit no looss. Also determine how much
// profit he made or loss he incurred.

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter cp : ");
		int cp = sc.nextInt();
		System.out.println("enter sp : ");
		int sp = sc.nextInt();
		
//		if(sp>cp) 
//			System.out.println("profit is " + (sp-cp));
//		if(cp>sp) 
//			System.out.println("loss is " + (cp-sp));
//		if(cp==sp)
//			System.out.println("no profit no loss");

		
		if(sp>cp) 
			System.out.println("profit is " + (sp-cp));
		else if(cp>sp) 
			System.out.println("loss is " + (cp-sp)+ "...");
		else 
			System.out.println("no profit no loss");
		

	}

}
