package Com;

import java.util.ArrayList;

public class ForEachPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Mango");//Adding object in arraylist    
		  list.add("Apple");    
		  list.add("Banana");    
		  list.add("Grapes");  
		  
		  list.forEach(fruit -> System.out.println(fruit));
	}
}
