package Com;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
	 String str="abackkadwiudbjkkbfs";
	 
	char[] chr=str.toCharArray();
	
	HashMap<String, Integer> hm=new HashMap<String, Integer>();
	
	
	for(int i=0;i<chr.length;i++) {
		int count =1;
		for(int j=i+1;j<chr.length;j++) {
			
			if(chr[i]==chr[j]) {
				count++;
				chr[j]='0';
			}
		}
		
		hm.put(Character.toString(chr[i]),count);
		
	}
	
	for(Map.Entry<String, Integer> mp: hm.entrySet()) {
		
		String key= mp.getKey();
		int value=mp.getValue();
		System.out.println(key+" : "+value);
		
	}
	
	

	}

}
