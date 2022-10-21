package Jva8feature;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetStringStream {
	public static void main(String[] args) {
	
	Set<String> set= new HashSet();
	set.add("Madhuri");
	set.add("sarita");
	set.add("sanika");
	set.add("siya");
	set.add("mansi");
	set.add("sharu");
	set.add("komal");
	set.add("rani");
	set.add("harshu");
	set.add("siya");
	
	Set<String> output= set.stream().filter(x-> x.startsWith("s")).collect(Collectors.toSet());
	System.out.println(output);
	
		
	Set<String> output3= set.stream().filter(x-> x.length()>5).collect(Collectors.toSet());
	System.out.println(output3);
	
		
	Set<String> output4= set.stream().filter(x-> x.contains("u")).collect(Collectors.toSet());
	System.out.println(output4);
	

	
		
	}

}
