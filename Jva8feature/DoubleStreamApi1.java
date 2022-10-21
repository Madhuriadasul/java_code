package Jva8feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleStreamApi1 {
	public static void main(String[] args) {
		List<Double> numbers= new ArrayList();
		
		numbers.add(12321.9);
		numbers.add(12321.4);
		numbers.add(45231.9);
		numbers.add(1986431.4);
		numbers.add(1895453.5);
		numbers.add(19865.4);
		numbers.add(45231.8);
		numbers.add(1895453.4);
		numbers.add(4532.675);
		
		
		System.out.println(numbers);
		
		List<Double> output= numbers.stream().filter(x-> x>=12342).map(x-> x*2).sorted().collect(Collectors.toList());
		System.out.println(output);
		
	
		
	}

}
