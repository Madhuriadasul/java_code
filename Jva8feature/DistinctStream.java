package Jva8feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctStream {
public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(2,3,5,4,6,1,3,2,4,9,6,7);
	
	List<Integer> output= numbers.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(output);
	
}
}
