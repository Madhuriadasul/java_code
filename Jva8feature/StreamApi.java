package Jva8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Emp{
	
public Emp(int i, String string, String string2) {
		
	}
private Integer id;
private String name;
private String address;

}
	


public class StreamApi {
	public static void main(String[] args) {
		List<Emp> list= new ArrayList<Emp>();
		
		list.add(new  Emp(12,"Mand","Pune"));
		list.add(new Emp(34,"Raj","Thane"));
		list.add(new Emp(84,"Rajeshi","Thane"));
		list.add(new Emp(44,"Ram","Pune"));
		list.add(new Emp(74,"Ravina","Thane"));
		list.add(new Emp(14,"Raju","Kolhapur"));
		list.add(new Emp(94,"Rasika","Kagal"));
		list.add(new Emp(74,"Raj","Thane"));
		
		System.out.println(list);
		
	
		
		
		
	}

}
