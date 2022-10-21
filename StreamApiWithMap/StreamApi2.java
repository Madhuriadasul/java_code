package StreamApiWithMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi2 {
	public static void main(String[] args) {
		List<String> stringlist= new ArrayList();
		stringlist.add("2");
		stringlist.add("9");
		stringlist.add("4");
		stringlist.add("8");
		stringlist.add("3");
		
		List<Integer> itr= stringlist.stream().map(a-> Integer.parseInt(a)).collect(Collectors.toList());
		System.out.println("number representation-->"+ itr);
		
		
		//calculate the square of number
		List<Integer> sqr=itr.stream().map(n->n*n).collect(Collectors.toList());
		
		System.out.println(sqr);
	}

}
