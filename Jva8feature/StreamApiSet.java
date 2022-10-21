package Jva8feature;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiSet {
	public static void main(String[] args) {
		Set<Integer> sp= new HashSet();
		
		sp.add(23);
		sp.add(43);
		sp.add(20);
		sp.add(12);
		sp.add(30);
		sp.add(40);
		
		Set<Integer> output= sp.stream().filter(x->x>=10).collect(Collectors.toSet());
		System.out.println(output);
		
		Set<Integer> output2= sp.stream().filter(x->x>20).map(x-> x*2).collect(Collectors.toSet());
		System.out.println(output2);
		
		
		long count=sp.stream().filter(x-> x>=23).map(x-> x*3).count();
		System.out.println(count);
		
		
		
	}

}
