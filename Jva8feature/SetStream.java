package Jva8feature;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetStream {
	public static void main(String[] args) {
		Set<Integer> number= new HashSet();
		
		number.add(12);
		number.add(90);
		number.add(34);
		number.add(43);
		number.add(12);
		number.add(98);
		number.add(89);
		number.add(18);
		number.add(56);
		number.add(65);
		
		System.out.println(number);
		
		Set<Integer> output= number.stream().filter(x-> x>=43).map(x-> x*10).distinct().collect(Collectors.toSet());
		
		System.out.println(output);
		
		
	}

}
