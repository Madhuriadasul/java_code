package StreamApiWithMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Imp{
	private Integer id;
	private String name;
	private String loc;
	
	public Imp(Integer id,String name,String loc) {
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
		return "Imp [id=" + id + ", name=" + name + ", loc=" + loc + "]";
	}
	
}

public class CustomObjectListsorting {
	public static void main(String[] args) {
		List<Imp> list= new ArrayList();
		
		list.add(new Imp(12,"mani","pune"));
		list.add(new Imp(19,"sanu","pune"));
		list.add(new Imp(12,"pallvi","pune"));
		list.add(new Imp(16,"rani","pune"));
		list.add(new Imp(20,"ram","pune"));
		list.add(new Imp(13,"raj","pune"));
		list.add(new Imp(18,"nik","pune"));
		list.add(new Imp(14,"mani","thane"));
		list.add(new Imp(17,"ram","pune"));
		
		Comparator<Imp> cmp=Comparator.comparing(Imp::getId).thenComparing(Imp::getName).thenComparing(Imp::getLoc);
		Collections.sort(list,cmp);
		System.out.println(list);
		
		
		
		
	}

}
