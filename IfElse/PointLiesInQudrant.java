package IfElse;
import java.util.*;

// given a point(x,y), write a program to find out if it lies in the 1st,
// 2nd, 3rd, 4th qudrant on the x axis y axix or at the origin

public class PointLiesInQudrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter ordinate value : ");
		int x = sc.nextInt();
		System.out.println("enter absissa value : ");
		int y = sc.nextInt();
		
		if(x==0 && y==0)
			System.out.println("Point lies on origin");
		else if(x>0 && y>0)
			System.out.println("("+ x+ "," +y+ ")"+ "lies in 1st qudrant" );
		else if(x<0 && y>0) 
			System.out.println("Point lies in 2nd Qudrant");
		else if(x<0 && y<0)
				System.out.println("Point lies in 3rd qudrant");
		else
				System.out.println("Point lies in 4th qudrant");
	}

}


