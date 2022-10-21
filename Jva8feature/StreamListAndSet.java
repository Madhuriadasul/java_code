package Jva8feature;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamListAndSet {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(90);
		list.add(56);
		List<Integer> output= list.stream().filter(x-> x>=20).collect(Collectors.toList());
		
		System.out.println(output);
		
		Set<Integer> set= new HashSet();
		
		set.add(22);
		set.add(12);
		set.add(32);
		set.add(44);
		set.add(58);
		
		Set<Integer> output2= set.stream().map(x-> x /2).collect(Collectors.toSet());
		System.out.println(output2);
	}

}
