package Jva8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FloatStream {
	public static void main(String[] args) {
		
		List<Float> list= new ArrayList();
		list.add(123.4f);
		list.add(00.5f);
		list.add(321.4f);
		list.add(23.2f);
		list.add(65.5f);
		list.add(89.9f);
		list.add(00.5f);
		list.add(89.9f);
		list.add( 65.5f);
		
		List<Float> output= list.stream().filter(x-> x>=50).collect(Collectors.toList());
		System.out.println(output);
		
		List<Float> output2= list.stream().filter(x-> x>=50).distinct().collect(Collectors.toList());   //distinct= remove  duplicate element
		System.out.println(output2);
		
	}

}
