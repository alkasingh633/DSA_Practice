package Loop;
import java.util.*;

// proint GP- 1,2,4,8...upto n

public class PrintGP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=1, r=2;
		for(int i=1; i<=n; i++) {
			System.out.println(a);
			System.out.println(a +" ..");
			a*=r;
		}

	}

}
