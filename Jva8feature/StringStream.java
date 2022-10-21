package Jva8feature;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StringStream {
	public static void main(String[] args) {
		Set<String> set= new HashSet();
		
		set.add("ABCKJ");
		set.add("PQR");
		set.add("MAT");
		set.add("NFKJH");
		set.add("MHG");
		set.add("ABCERW");
		set.add("PQRT");
		set.add("XYZ");
		set.add("MHG");
		set.add("XYZUT");
		set.add("MSGf");
		
		Set<String> output= set.stream().map(x-> x.concat("_is")).collect(Collectors.toSet());
		System.out.println(output);
		
		
		
		
		Set<String> output3= set.stream().filter(x-> x.length()>=4).collect(Collectors.toSet());
		System.out.println(output3);
		
		
	}

}
