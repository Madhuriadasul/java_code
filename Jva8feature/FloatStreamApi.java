package Jva8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FloatStreamApi {
	public static void main(String[] args) {
		List<Float> list= new ArrayList();
		list.add(6.9f);
		list.add(91.5f);
		list.add(32.4f);
		list.add(22.7f);
		list.add(92.4f);
		list.add(12.4f);
		
		List<Float> output= list.stream().filter(x->x>=20).sorted().collect(Collectors.toList());
		System.out.println(output);
		
	}

}
