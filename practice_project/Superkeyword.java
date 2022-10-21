package practice_project;
class Super{
	
	String address;
  Integer id;
	
	Super(String address,Integer id) {
	this.address=address;
	this.id=id;
	}
		
	

void m1() {
	
 System.out.println(" address   "  +  address);
 System.out.println(" id   "  + id);
}

}
class school extends Super {
	String name;
	String surname;
	Integer rollno;
public school (String address ,Integer id,String name,String surname,Integer rollno) {
	super(address,id);
	this.name=name;
	this.surname=surname;
	this.rollno=rollno;
	
	
}
void disp()
{

	System.out.println("name  " + name);
	System.out.println("surname " + surname);
	System.out.println("rollno  " + surname);
	
}
	
}
public class Superkeyword {
	public static void main(String[] args) {
	school sc= new school("pune", 1, "madhuri", "chougale", 4);
	sc.m1();
	sc.disp();
	
	
	
	}

}
