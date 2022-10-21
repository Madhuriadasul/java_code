package Jva8feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamwithCount {
public static void main(String[] args) {
	List<Integer> list= Arrays.asList(4,6,3,2,7,5,5,8,1,4,6,4,6,4,9);
	
	List<Integer> output= list.stream().filter(x-> x>=4).collect(Collectors.toList());
	System.out.println(output);
	
	
	List<Integer> output2= list.stream().filter(x-> x>=4).distinct().collect(Collectors.toList());
	System.out.println(output2);
	
	
	long count= list.stream().filter(x-> x>=6).count();
	System.out.println(count);
	
	
	List<Integer> output3= list.stream().filter(x-> x>=7).collect(Collectors.toList());
	System.out.println(output3);
	
}
}
