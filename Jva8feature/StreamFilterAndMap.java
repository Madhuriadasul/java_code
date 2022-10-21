package Jva8feature;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamFilterAndMap {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList();
		list.add(78);
		list.add(28);
		list.add(17);
		list.add(90);
		list.add(12);
		list.add(23);
		List<Integer> result= list.stream().filter(x-> x>12).collect(Collectors.toList());
		System.out.println(result);
		
		List<Integer> result2= list.stream().map(x-> x*2).collect(Collectors.toList());
		System.out.println(result2);
		
		
		List<Integer> result3=list.stream().filter(x-> x>10).map(x-> x*2).collect(Collectors.toList());
		System.out.println(result3);
	}


}