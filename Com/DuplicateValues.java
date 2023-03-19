package Com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Integer> list=Arrays.asList(2,2,2,3,4,4,5);
		
		List<Integer> list=new ArrayList<Integer>();
		//int[] arr=[2,2,2,3,4,4,5];
		
		Collections.addAll(list, 2,2,2,3,4,4,5);
		 
		
		Set<Integer> set=new HashSet<Integer>();
		
		System.out.println("values"+list.stream().filter(n->!set.add(n)).collect(Collectors.toSet()));
		
		
		System.out.println("Non duplicate element");
		//find non duplicate value using stream
	    list.stream().filter(n -> Collections.frequency(list, n)==1).collect(Collectors.toList())
	    			 .forEach(System.out::println);

	    System.out.println("duplicate element");
	    
		//find duplicate element
	 // set.add(list.stream().filter(n -> Collections.frequency(list, n)>1).collect(Collectors.toSet()));
	  
		// set.forEach(System.out::println);
				
		
		
		

	}

}
