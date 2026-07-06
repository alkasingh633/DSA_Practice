package IfElse;
import java.util.*;

//take length and breadth of rectangle as input and WAP to find whether 
// the area of rectangle is greater than its perimeter.

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter length : ");
		int l = sc.nextInt();
		System.out.println("enter breadth : ");
		int b = sc.nextInt();
		
		int area;
		 area = l*b;
		 System.out.println("area of rectangle : " +area);
		 
		 int perimeter;
		 perimeter = 2*(l+b);
		 System.out.println("Perimeter of rectangle : "+ perimeter);
		 
		 if(area>perimeter)
			 System.out.println("area is greater then perimeter");
		 else
			 System.out.println("perimeter is greater");
	}

}
