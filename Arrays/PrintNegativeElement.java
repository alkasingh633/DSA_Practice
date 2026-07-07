package Arrays;

public class PrintNegativeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,-6,7,-1,5,9,-3};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0) {
				System.out.print(arr[i]+" ");
			}
		}
		

	}

}
