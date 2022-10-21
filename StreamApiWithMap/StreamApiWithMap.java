package StreamApiWithMap;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApiWithMap {
	public static void main(String[] args) {
		Map<Integer,Integer> map= new HashMap();
		
		map.put(10, 200);
		map.put(90, 900);
		map.put(20, 100);
		map.put(70, 800);
		map.put(40, 300);
		map.put(80, 700);
		map.put(30, 400);
		map.put(60, 600);
		
		Map<Integer,Integer> cmp= map.entrySet().stream().filter(a-> a.getValue()>300).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(cmp);
		
		Map<Integer,Integer> cmp2= map.entrySet().stream().filter(a-> a.getKey()>=70).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(cmp2);
		
	}
	
	

}
