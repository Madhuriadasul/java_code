package Jva8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class EmpIp{
	private Integer id;
	private String name;
	private Float salary;
	public EmpIp(Integer id, String name, Float salary ) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
public class CustomClassWithStream {
public static void main(String[] args) {
	List<EmpIp> emplist= new ArrayList<EmpIp>();
	emplist.add(new EmpIp(2,"Madhuri",3000.00f));
	emplist.add(new EmpIp(5,"Anita",8000.00f));
	emplist.add(new EmpIp(3,"Sarika",23000.5f));
	emplist.add(new EmpIp(1,"Rani",7000.0f));
	emplist.add(new EmpIp(7,"Nilu",4000.00f));
	emplist.add(new EmpIp(4,"Kaju",9000.00f));
	emplist.add(new EmpIp(2,"Madhuri",8000.00f));
	
	List<EmpIp> output= emplist.stream().filter(x-> x.getId()>=4).collect(Collectors.toList());
	System.out.println(output);
	

	List<EmpIp> output2= emplist.stream().filter(x-> x.getId()>=4 && x.getName().contains("u")).collect(Collectors.toList());
	System.out.println(output2);
	
	List<EmpIp> output3= emplist.stream().filter(x-> x.getId()>=4 || x.getName().contains("u")).collect(Collectors.toList());
	
	System.out.println(output3);
	
	List<Integer> output21= emplist.stream().map(x-> x.getId()*2 ).collect(Collectors.toList());
	System.out.println(output21);
	
	
   long emlist=emplist.stream().filter(x-> x.getId()>=3).count();
   System.out.println(emlist);
	

	
	List<EmpIp> eml= emplist.stream().distinct().collect(Collectors.toList());
	System.out.println(eml);
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
