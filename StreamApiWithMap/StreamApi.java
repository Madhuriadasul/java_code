package StreamApiWithMap;
import java.util.*;
import java.util.stream.Collectors;
public class StreamApi {
	public static void main(String[] args) {
		List<Integer> in= new ArrayList();
		in.add(200);
		in.add(900);
		in.add(300);
		in.add(800);
		in.add(400);
		in.add(700);
		
		List<Integer> result= in.stream().filter(x-> x>=300).collect(Collectors.toList());
		System.out.println(result);
		
		List<Integer> result2= in.stream().map(i-> i*2).collect(Collectors.toList());
		System.out.println(result2);
		
		in.forEach(a-> System.out.println(a + "\t"));  //display element by using forEach Loop
		
		System.out.println();
		Optional<Integer> result3=in.stream().findFirst();
		System.out.println("first element-->"+result.get(0));
		
		
	}

}
