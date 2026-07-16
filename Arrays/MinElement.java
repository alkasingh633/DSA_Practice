package Arrays;

public class MinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,6,98,34,-3,-7};
		
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min =arr[i];
			}
			
		}
		
		System.out.println("minimum value is "+min);

	}

}
