package NewCom;
import java.util.Arrays;

public class MaxAndMin {

	public static void main(String[] args) {
		
		
int[] arr= {1,3,5,7,9};

    printSum(arr);
	}
	public static void printSum(int[] input) {
		
		int n=input.length;

		Arrays.sort(input);
		int minsum=0;
		int maxsum=0;

		for(int i=0;i<n;i++){

		if(i<n-1){
		minsum=minsum+input[i];}

		if(i>0){
		maxsum=maxsum+input[i];

		}

		}


		System.out.println(minsum+" "+maxsum);

	}

}
