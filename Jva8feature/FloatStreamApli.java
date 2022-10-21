
package Jva8feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FloatStreamApli {
	public static void main(String[] args) {
		List<Float> numbers= Arrays.asList(22.4f,67.9f,12.5f,15.6f,23.4f,12.5f,12.34f,22.4f,23.1f,45.0f);
		
		
		List<Float> output= numbers.stream().filter(x-> x>10).sorted().distinct().collect(Collectors.toList());
		
		System.out.println(output);
		
	
		
		
		
	}

}
