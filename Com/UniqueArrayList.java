package Com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UniqueArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l=new ArrayList<>();
		
		l.add("Mango");
		l.add("Banana");
		l.add("Mango");
		l.add("Apple");
		
		Set<String> set=new LinkedHashSet<String>(l);
		
		System.out.println("values"+set);
		
		//Using Java8 Stream
		ArrayList<Integer> al= new ArrayList<>(Arrays.asList(1,1,1,2,2,3,4,4,5,5,6,6,6,7,8,9,9));
		
		List<Integer> list= al.stream().distinct().collect(Collectors.toList());
		
		System.out.println(list);
		
		

	}

}
