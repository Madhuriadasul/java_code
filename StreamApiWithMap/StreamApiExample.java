package StreamApiWithMap;
import java.util.*;
class EmpCode{
	private Integer id;
	private String name;
	private Float mobno;
	
	public EmpCode(Integer id,String name,Float mobno) {
		this.id=id;
		this.setName(name);
		this.setMobno(mobno);
		
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
		this.name = name;
	}

	public Float getMobno() {
		return mobno;
	}

	public void setMobno(Float mobno) {
		this.mobno = mobno;
	}
	
	
}
public class StreamApiExample {
	public static void main(String[] args) {
		List<EmpCode> emp= new ArrayList();
		emp.add(new EmpCode(2,"ABC",9976147812f));
		emp.add(new EmpCode(9,"XYZ",9956432987f));
		emp.add(new EmpCode(6,"BC",9098765432f));
		emp.add(new EmpCode(4,"ABC",9654328097f));
		emp.add(new EmpCode(7,"PRC",79761647812f));
		emp.add(new EmpCode(1,"BND",4576147812f));
		emp.stream().filter(EmpCode-> EmpCode.getMobno()==9956432987f).forEach(EmpCode-> System.out.println(EmpCode.getName()));
		emp.stream().filter(EmpCode-> EmpCode.getMobno()==9956432987f).forEach(EmpCode-> System.out.println(EmpCode.getId()));
		
		emp.stream().filter(x-> x.getName()=="ABC").forEach(x->System.out.println(x.getId()));
		emp.stream().filter(x-> x.getName()=="ABC").forEach(x->System.out.println(x.getMobno()));
	}

}
