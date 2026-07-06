package Loop;

public class EvenPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //50 baar chalega
		for(int i =2; i<=100; i=i+2) {
			System.out.println(i);
		}
		
		//100 times chalega
		for(int i=1; i<=100; i=i+1) {
			if(i%2==0)
				System.out.println(i);
			i++;
			System.out.println(i);		}
	}

}
