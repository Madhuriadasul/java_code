package Jva8feature;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class ArrayListwithStreamApi {
	public static void main(String[] args) {
		List<Integer> list1= Arrays.asList(10,90,20,40,30,80);
		List<Integer> list2= Arrays.asList(2,6,8,4,9,3);
		List<Integer> list3= Arrays.asList(900,300,400,200,100,600);
		
		List<List<Integer>> listint= new ArrayList();
		
		listint.add(list1);
		listint.add(list2);
		listint.add(list3);
		
		System.out.println(listint);
		
		List<Integer> maplist= list1.stream().filter(x-> x>=30).distinct().map(x-> x*2).collect(Collectors.toList());
		System.out.println(maplist);
		
		//collection data from multiple list into one list.
		List<Integer> flatMapList=listint.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
		System.out.println(flatMapList);
	}

}
