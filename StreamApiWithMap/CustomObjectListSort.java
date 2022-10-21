package StreamApiWithMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.List;

class Imp1{
	private Integer id;
	private String name;
	private String loc;
	
	public Imp1(Integer id,String name,String loc) {
		this.id=id;
		this.name=name;
		this.loc=loc;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id=id;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc=loc;
	}
	@Override
	public String toString() {
		return "Imp1 [id=" + id + ", name=" + name + ", loc=" + loc + "]";
	}
	
}

public class CustomObjectListSort {
 public static void main(String[] args) {
	 List<Imp1> list= new ArrayList();
	 list.add(new Imp1(12,"Ram","Latur"));
	 list.add(new Imp1(12,"Ram","Latur"));
	 list.add(new Imp1(13,"Ram","Latur"));
	 list.add(new Imp1(16,"Ram","Latur"));
	 list.add(new Imp1(11,"Ram","Latur"));
	 list.add(new Imp1(16,"Raj","Latur"));
	 list.add(new Imp1(12,"Rock","pune"));
	 System.out.println(list);
	
	 Comparator<Imp1> cmp=Comparator.comparing(Imp1::getId);
	 Collections.sort(list,cmp);
	 System.out.println(list);
	 
	 
	 
	 
	
}

}
