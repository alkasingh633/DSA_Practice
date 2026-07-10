package Arrays;

public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,87,45,7,45,9,7};
		
		 int max =arr[0];
		 for(int i =0; i<arr.length; i++) {
			 if(arr[i]>max ) {
				 max =arr[i];
			 }
			 
		 }
		 System.out.println("max = "+max);
		 System.out.println("max is "+max);
		 System.out.println(max);
		 

	
		 

	}

}
