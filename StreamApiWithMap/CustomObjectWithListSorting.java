package StreamApiWithMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Animall{
	
	private Integer count;
	private String name;
	private String colour;
	
	public Animall(Integer count,String name,String colour) {
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
		return "Animall [count=" + count + ", name=" + name + ", colour=" + colour + "]";
	}
	
	
}

public class CustomObjectWithListSorting {
	public static void main(String[] args) {
		List<Animall> list= new ArrayList();
		
		list.add(new Animall(12,"Lion","Browan"));
		list.add(new Animall(67,"Dog","Whitee"));
		list.add(new Animall(34,"Cat","Black"));
		list.add(new Animall(90,"Zebra","Black"));
		list.add(new Animall(32,"Dog","Black"));
		list.add(new Animall(12,"Lion","yellow"));
		list.add(new Animall(89,"Monkey","Browan"));
		list.add(new Animall(25,"Caw","Browan"));
		list.add(new Animall(34,"Cat","Alack"));
		
		System.out.println(list);
		list.add(new Animall(1000,"Bull","White"));
		System.out.println(list);

		List<Animall> am= list.stream().filter(x-> x.getCount()>50).distinct().collect(Collectors.toList());
		System.out.println(am);
		
		Comparator<Animall> cmp= Comparator.comparing(Animall::getCount).thenComparing(Animall::getName).thenComparing(Animall::getColour);
		Collections.sort(list,cmp);
		System.out.println(list);
	}

}
