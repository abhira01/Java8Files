package Com;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int arr[]= {5,2,3,4,1,6,7,8};
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				int t=0;
				if(arr[i]>arr[j]) {
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
			System.out.println(arr[i]);
		}
		
		
	}

}
