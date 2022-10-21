package Jva8feature;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FloatStream2 {
	public static void main(String[] args) {
		Set<Float> set= new  HashSet();
		
		set.add(45.7f);
		set.add(55.7f);
		set.add(85.7f);
		set.add(25.7f);
		set.add(65.7f);
		set.add(65.7f);
		set.add(35.7f);
		set.add(45.7f);
		set.add(05.7f);
		set.add(355.7f);
		set.add(55.7f);
		set.add(475.7f);
		set.add(045.7f);
		set.add(0.0f);
		
		Set<Float> output= set.stream().filter(x-> x>=45).collect(Collectors.toSet());
		System.out.println(output);
		
		
		Set<Float> output2= set.stream().filter(x-> x>=45).map(x-> x*3).collect(Collectors.toSet());
		System.out.println(output2);
	}

}
