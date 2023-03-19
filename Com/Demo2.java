//find char count in string
package Com;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {

	public static void main(String[] args) {
		String str="aaabbbccdddd";
		
		Map<String,Integer> map=new HashMap<String, Integer>();
		
		char [] chr=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			int count=1;
			for(int j=i+1;j<str.length();j++) {
				if(chr[i]==chr[j] && chr[j]!='0') {
					count++;
					chr[j]='0';
				}
			}
			
			map.put(Character.toString(chr[i]), count);
		}
		
		for(Map.Entry<String, Integer> mp:map.entrySet()) {
			String key=mp.getKey();
			int value=mp.getValue();
			
			System.out.println(key+" : "+value);
					
		}
		
		
		
	}

}
