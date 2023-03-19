package Com;

public class Missing_number {

	public static void main(String[] args) {
		
	int arr[]= {10,9,8,7,6,4,3,2,1};
	double n=10;

		double sum1 =n*(2*1+(n-1)*1)/2;
		System.out.println(sum1);
	double sum2=0;
	for(int i=0; i<arr.length; i++) {
		
		sum2=sum2+arr[i];
		
	}
	
	System.out.println(sum2);
	double m=sum1-sum2;
	System.out.println(m);	
	
	}
}
