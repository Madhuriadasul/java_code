package OOOPSConcept;
class student{
	String name="riya";
	String address="pune";
	
	int id=23;
	

	
	
	public void study() {
		System.out.println("name ..." + name);
		System.out.println("address ..." + address);
		System.out.println("id..." + id);
		
	System.out.println("i am studing");
	
		//argument different
	}
	public void study(int roono) {
		System.out.println("i am not studing");
	}
}

public class Constructuore {
	public static void main(String[] args) {
		student st= new student();
		
		st.study();
		st.study(3);
		student st2= new student();
		st2.study();
		st2.study(4);
	}

}
