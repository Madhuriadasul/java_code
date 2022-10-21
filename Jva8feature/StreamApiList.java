package Jva8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiList {
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList();
		list.add(12);
		list.add(67);
		list.add(90);
		list.add(80);
		list.add(60);
		list.add(66);
		
		List<Integer> FilterList = new ArrayList();
		
		List<Integer> output= list.stream().filter(x-> x>20).collect(Collectors.toList());
			
		System.out.println(output);
		}
	
		
		
	
	
	}


