package practice_project;
class Thisp{
	String name;
	String surname;
	int id;
	
	public Thisp(String name,String surname,int id) {
		this.name=name;
		this.surname=surname;
		this.id=id;
		
	}
	void disp() {
		System.out.println("name  "+ name);
		System.out.println("surname "+ surname);
		System.out.println("id " + id );
	}
}

public class Thisoperation {
public static void main(String[] args) {
	Thisp th=new Thisp("madhuri", "chougale", 1);
	th.disp();
	
	
	
}
}
