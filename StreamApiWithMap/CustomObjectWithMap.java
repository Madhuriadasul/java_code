package StreamApiWithMap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Cmp{
	private Integer id;
	private String name;
	private String address;
	
	public Cmp(Integer id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
		
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
	public String getAddress() {
		return address;
		
	}
	public void setAddress(String address) {
		this.address=address;
	}
	@Override
	public String toString() {
		return "Cmp [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}

public class CustomObjectWithMap {
	public static void main(String[] args) {
		Map<Integer,Cmp> map= new HashMap();
		map.put(10,new Cmp(900,"Raju","pune"));
		map.put(20,new Cmp(200,"Priya","pune"));
		map.put(70,new Cmp(700,"Mani","pune"));
		map.put(40,new Cmp(400,"Kaju","pune"));
		map.put(80,new Cmp(600,"Raj","pune"));
		map.put(50,new Cmp(300,"Ram","pune"));
		map.put(90,new Cmp(800,"Anita","pune"));
		
		Map<Integer,Cmp> result= map.entrySet().stream().filter(x-> x.getValue().getId()>=100).collect(Collectors.toMap(Map.Entry::getKey,
				Map.Entry::getValue));
		System.out.println(result);
		Map<Integer,Cmp> result2= map.entrySet().stream().filter(x->x.getKey()>50).collect(Collectors.toMap(Map.Entry::getKey,
				Map.Entry::getValue));
		
		System.out.println(result2);
		
		Map<Integer,Cmp> result3=map.entrySet().stream().filter(x->x.getKey()>20).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(result3);
	}

}
