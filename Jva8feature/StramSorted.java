package Jva8feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StramSorted {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList();

		list.add(10);
		list.add(20);
		list.add(70);
		list.add(5);
		list.add(3);
		list.add(8);
		list.add(9);
		list.add(0);
		list.add(5);
		
		//Sorted element as Ascending Order
		
		List<Integer> asc= list.stream().sorted().collect(Collectors.toList());
		System.out.println(asc);
		
		//sorted Element as Descending order
		
		List<Integer> des=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(des);
		
		// Distinct element from ArrayList   or Remove duplicate from ArrayList
		
		List<Integer> distnt= list.stream().distinct().collect(Collectors.toList());
		System.out.println(distnt);
		
		List<Integer> numbers= Arrays.asList(3,2,5,7,9,2);    //NEW Integer list create
		
		//get list of Unique squares
		
		List<Integer> squareslist= numbers.stream().map(i-> i*i).distinct().collect(Collectors.toList());   //distinct..remove duplicate value
		System.out.println(squareslist);
		
		
		List<String> strings= Arrays.asList("ABC","","PQR","","XYZ","ABC","VB","");   //new String list create
		
		//get count empty string
		
		int empty=(int) strings.stream().filter(string->string.isEmpty()).count();
		System.out.println(empty);
		
		int nonempty=(int) strings.stream().filter(string->!string.isEmpty()).count();
		System.out.println(nonempty);
		
		

		
	}

}
