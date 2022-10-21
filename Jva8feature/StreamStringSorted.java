package Jva8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStringSorted {
	public static void main(String[] args) {
		List<String> name= new ArrayList();
		name.add("madhuri");
		name.add("manasi");
		name.add("madhura");
		name.add("madhu");
		name.add("siya");
		System.out.println(name);
		
		List<String> output= name.stream().filter(e->e.startsWith("m")).collect(Collectors.toList());
		System.out.println(output);
		
		
		List<String> output2= name.stream().filter(e->e.startsWith("s")).collect(Collectors.toList());
		System.out.println(output2);
	
	List<String> names= new ArrayList<String>();
     names.add("mani");
     names.add("anita");
     names.add("raju");
     names.add("ciya");
     
     System.out.println(names);
     
     List<String> output3=names.stream().sorted().collect(Collectors.toList());
     System.out.println(output3);
     

	

	}	
}
