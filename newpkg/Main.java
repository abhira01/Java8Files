package newpkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//Mymap mm=new Mymap();
		Mymap.something();
		
		String str="";
		
		String s="UBSSUBSUBSUBS";
		char[] ch = s.toCharArray();
		//String newString="";
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='S') {
				
				sb.append(ch[i]);
				
			}
		}
		
		System.out.println("new String : "+sb); 
		
		
	
		
		
		
	
		
		
	}

}
