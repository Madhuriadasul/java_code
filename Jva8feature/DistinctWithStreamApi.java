package Jva8feature;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctWithStreamApi {
	public class ArrayListwithStreamApi {

	}

	public static void main(String[] args) {
		List<Integer> in= Arrays.asList(3,6,56,12,67,90,34,12,90,56,12,43,34,64);

	List<Integer> output=in.stream().filter(x-> x>10).distinct().map(x-> x*5).collect(Collectors.toList());
	System.out.println(output);
	
	
	
	List<Integer> output2 =in.stream().filter(x->x >=20).distinct().map(x-> x*3).collect(Collectors.toList());
	System.out.println(output2);
	
		
	in.stream().filter(x->x >=20).distinct().map(x-> x*3).forEach(System.out::println);
	

}
}