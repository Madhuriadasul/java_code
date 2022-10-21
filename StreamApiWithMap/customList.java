package StreamApiWithMap;

import java.util.ArrayList;
import java.util.List;

class All{
	private Integer id;
	private String name;
	public All(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		return "All [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class customList {
	public static void main(String[] args) {
		List<All> all= new ArrayList<All>();
		all.add(new All(1,"mansi"));
		all.add(new All(7,"rani"));
		all.add(new All(3,"abc"));
		all.add(new All(9,"abs"));
		all.add(new All(3,"abc"));
		all.add(new All(1,"mansi"));
		
		System.out.println(all);
		
		
		
		
	}

}
