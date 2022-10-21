package Jva8feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FloatStreamWithCount {
	public static void main(String[] args) {
		
		
		List<Float> number= Arrays.asList(12.5f,90.6f,13.6f,78.1f,14.3f,67.3f,16.2f,90.2f,12.5f,67.3f);
		
		System.out.println(number);
		
		List<Float> output= number.stream().filter(x-> x>60).collect(Collectors.toList());
		
		System.out.println(output);
		
		long count= number.stream().filter(x-> x>60).count();
		System.out.println(count);
		
		List<Float> output2= number.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(output2);
		

		List<Float> output3= number.stream().map(x-> x*2).collect(Collectors.toList());
		System.out.println(output3);
		
	}

}
