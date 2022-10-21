package StreamApiWithMap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Animal{
	private Integer count;
	private String name;
	private String colour;
	
	public Animal(Integer count,String name,String colour) {
		this.count=count;
		this.name=name;
		this.colour=colour;
		
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count=count;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public String getColour() {
		return colour;
		
	}
	public void setColour(String colour) {
		this.colour=colour;
	}
	@Override
	public String toString() {
		return "Animal [count=" + count + ", name=" + name + ", colour=" + colour + "]";
	}
	
}

public class CustomObjectwithMap2 {
	public static void main(String[] args) {
		Map<Integer,Animal> pam= new HashMap<Integer,Animal>();
		
		pam.put(12,new Animal(9000,"Dog","black"));
		pam.put(10,new Animal(800,"Cat","black"));
		pam.put(19,new Animal(200,"Lion","browan"));
		pam.put(13,new Animal(1200,"Fox","browan"));
		pam.put(18,new Animal(600,"Zebra","black"));
		pam.put(14,new Animal(802344,"Monkey","brown"));
		
		Map<Integer,Animal> result= pam.entrySet().stream().filter(x->x.getValue().getCount()>1000).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(result);
		
		Map<Integer,Animal> result2= pam.entrySet().stream().filter(x->x.getValue().getCount()>500).filter(x-> x.getKey()>14).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
			System.out.println(result2);
			
	}

}
