package Com;

public class StringReverse {

	public static void main(String[] args) {
		String str="abhira";
		
		StringBuilder sb=new StringBuilder(str);
		String p=sb.reverse().toString();
		System.out.println(p);
	}

}
