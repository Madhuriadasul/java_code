package Jva8feature;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class StreamApiwithFlatMap {
	public static void main(String[] args) {
		List<String> list1= Arrays.asList("abc","xyz","pqr","stu","yqe","klq","trf");
		List<String> list2=  Arrays.asList("a","b","b","j","r","x","m");
		List<String> list3= Arrays.asList("mani","kaju","bhagu","raju");
		List<String> list4= Arrays.asList("cvbnm","yutre","uhgtr","ikmnbg");
		
		List<List<String>> liststring= new ArrayList();
		
		liststring.add(list1);
		liststring.add(list2);
		liststring.add(list3);
		liststring.add(list4);
		
		List<String> res= list1.stream().filter(x->x.contains("q")).collect(Collectors.toList());
		System.out.println(res);
		
		List<String>  flatMapList=liststring.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
	System.out.println(flatMapList);
		
	}

}
 