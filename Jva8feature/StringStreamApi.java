package Jva8feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStreamApi {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Mnisha","Rutuja","Radhika","Sunita","Komal","Nisha","Suhani","Aahisha");
		
		List<String> output= names.stream().filter(x-> x.contains("h")).filter(x-> x.length()>5).collect(Collectors.toList());
		System.out.println(output);
		
		List<String> output2= names.stream().filter(x-> x.contains("h")).filter(x-> x.length()>5).sorted().collect(Collectors.toList());
		System.out.println(output2);
		
		
	}

}
