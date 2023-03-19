package newpkg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewList {

	public static void main(String[] args) {
	
		 List<String> list=new ArrayList<>();
	        list.add("apple");
	        list.add("apple");
	        list.add("orange");
	        list.add("banana");
	        
	        
	    list.stream().filter(a-> a!="orange").forEach(p-> System.out.println(p));
	        
	      //  System.out.println(newList);

	}

}
