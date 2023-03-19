package NewCom;

public class PrimeNoSum {

	public static void main(String[] args) {
		int n=2;
		
		long sum=0;
		
		//check no is prime
		while(n<50) {
			int flag =0;
			for(int i=2;i<=n/2;i++) {
				
				if(n%i == 0) {
					flag=1;
					break;
				}
				
			}if(flag!=1) {
				sum=sum+n;
				System.out.println("number is prime "+n);
			}
			
			n++;
		}
		System.out.println("\nsum is "+sum);
		

	}

}
