package StreamApiWithMap;
import java.util.*;
class Epm{
	private Integer id;
	private String name;
	
	public Epm(Integer id,String name) {
		this.id=id;
		this.name=name;
		
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
	@Override
	public String toString() {
		return "Epm [id=" + id + ", name=" + name + "]";
	}
	
}

public class CustomObjectSortList {
public static void main(String[] args) {
	List<Epm>set= new ArrayList();
	set.add(new Epm(20,"ABC"));
	set.add(new Epm(40,"yz"));
	set.add(new Epm(90,"PQR"));
	set.add(new Epm(30,"ABC"));
	set.add(new Epm(80,"ABC"));
	set.add(new Epm(10,"ABC"));
	set.add(new Epm(40,"YZ"));
	set.add(new Epm(90,"QR"));
	
	Comparator<Epm> cmp=Comparator.comparing(Epm::getId).thenComparing(Epm::getName);
	Collections.sort(set,cmp);
	System.out.println(set);
	
	
	
	
	
	
	
}
}
