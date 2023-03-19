package Com;

import java.util.HashMap;
import java.util.Map;

//print repeated char from String 

public class RepeatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value="welcome to chennai";
		char[] chr=value.toCharArray();
		
		//Map<String,Integer> repeat=new HashMap<String,Integer>();
		
		for(int i=0;i<chr.length;i++) {
			int count=0;
			
			for(int j=i+1;j<chr.length;j++) {
				if(chr[i]==chr[j] ) {
					count++;
					chr[j]='0';
				}
				
				if(count>0 && chr[i]!='0'){
					System.out.println(chr[i]);
				}
			}
			
		}

	}

}
