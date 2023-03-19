package Com;

import java.util.Arrays;

//find smallest some of two elements of array
public class SmallestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ele= {1,2,0,3,4,5};
		Arrays.sort(ele);
		
		int sum= ele[0]+ele[1];
		
		System.out.println("Smallest sum is : "+sum);
	
		
	}

}
