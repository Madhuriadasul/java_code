package StreamApiWithMap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMap {
public static void main(String[] args) {
	Map<Integer, Integer> intmap= new HashMap();
	
	intmap.put(2,213);
	intmap.put(9, 342);
	intmap.put(4,675);
	intmap.put(8, 456);
	
	intmap.put(1, 4345);
	System.out.println(intmap);
	
	Map<Integer,Integer> cmp= intmap.entrySet().stream().filter(x-> x.getKey()>3).collect(Collectors.toMap(Map.Entry::getKey
			,Map.Entry::getValue));
	
	System.out.println(cmp);
	
	Map<Integer,Integer> cmp2= intmap.entrySet().stream().filter(x-> x.getValue()>400).collect(Collectors.toMap(Map.Entry::getValue,
			Map.Entry::getKey));
	
	System.out.println(cmp2);
	Map<Integer,Integer> cmp3= intmap.entrySet().stream().filter(x-> x.getKey()>3).collect(Collectors.toMap(Map.Entry::getValue,
			Map.Entry::getKey));
	System.out.println(cmp3);
	
}
}
