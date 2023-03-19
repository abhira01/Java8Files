package Com;

public class Permutation {


	public static void main(String[] args) {
		String str="ABC";
		int len=str.length();
		
		System.out.println("All the permutation of the Strings are");
		generatePermutation(str,0,len);
		
	}	
	
	public static void generatePermutation(String str, int start,int end) {
		if(start==end-1) {
			System.out.println("String : "+str);
		}
		else {
			for(int i=start;i<end;i++) {
				str=swapString(str,start,i);
				
				generatePermutation(str, start+1, end);
				
				str=swapString(str, start, i);
			}
		}
		
	}
	
	
	public static String swapString(String a, int m,int n) {
		char []b=a.toCharArray();
		char ch;
		ch=b[m];
		b[m]=b[n];
		b[n]=ch;
		return  String.valueOf(b);
		
	}
}
