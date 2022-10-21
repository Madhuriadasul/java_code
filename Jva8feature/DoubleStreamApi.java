package Jva8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleStreamApi {
	public static void main(String[] args) {
		List<Double> list= new ArrayList();
		
		list.add(234545.3);
		list.add(4532.0);
		list.add(56789.2);
		list.add(5673.3);
		list.add(78905432.3);
		list.add(2345.3);
		list.add(564.3);
		list.add(65478.5);
		list.add(234545.3);
		list.add(98765.8);
		list.add(236.2);
		
		List<Double> output= list.stream().filter(x-> x>=4530).collect(Collectors.toList());
		System.out.println(output);
		
		List<Double> output2= list.stream().filter(x-> x>=4530).map(x-> x*2).collect(Collectors.toList());
		System.out.println(output2);
		
		List<Double> output3= list.stream().filter(x-> x>=4530).map(x-> x*2).sorted().collect(Collectors.toList());
		System.out.println(output3);
		
		List<Double> output4= list.stream().filter(x-> x>=4530).map(x-> x*2).sorted().distinct().collect(Collectors.toList());
		System.out.println(output4);
	}

}
