package Jva8feature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedFloatListwithStream {
	public static void main(String[] args) {
		
		List<Float> list= new ArrayList();
		
		list.add(23.3f);
		list.add(293.5f);
		list.add(34.9f);
		list.add(123.8f);
		list.add(89.2f);
		list.add(123.6f);
		list.add(96.3f);
		list.add(823.4f);
		list.add(223.2f);
		list.add(89.2f);
		list.add(96.3f);
		list.add(123.8f);
		
		List<Float> result= list.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
		
		
		List<Float> result2= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(result2);
		
		
	}

}
