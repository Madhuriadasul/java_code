package StreamApiWithMap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class EmpAll{
	
	
	private Integer id;
	private String name;
	
	public EmpAll(Integer id,String name) {
		this.id=id;
		this.name=name;
		
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

	@Override
	public String toString() {
		return "EmpAll [id=" + id + ", name=" + name + "]";
	}



	
	
}

public class StreamApiWithCustomObject {
	public static void main(String[] args) {
		Map<Integer,EmpAll> cmp= new HashMap<Integer,EmpAll>();
		cmp.put(13, new EmpAll(13,"ABC"));
		cmp.put(15, new EmpAll(18,"XYZ"));
		cmp.put(12, new EmpAll(12,"XYZ"));
		cmp.put(18, new EmpAll(15,"XYZ"));
		cmp.put(16, new EmpAll(19,"XYZ"));
		
		System.out.println(cmp);
		Map<Integer,EmpAll> result= cmp.entrySet().stream().filter(x-> x.getValue().getId()>=14).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		
		System.out.println(result);
	}

}
