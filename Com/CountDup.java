package Com;

import java.util.Map;
import java.util.stream.Collectors;

//6
public class CountDup {

	public static void main(String[] args) {
		String str="Welcometochennai";
		
		Map <Character,Long > map= str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c ->c, Collectors.counting()));
		map.forEach((k,v)->{
			if(v>1) {
				System.out.println(k+" : "+v);
			}
		});

	}

}
