package OOOPSConcept;
class person{
	public void showdata() {
		System.out.println("details of person");
	}
}class member extends person{
	public void showdata() {
		System.out.println("all details of member");
	}
	
}
                            //runtime polymorphism  i.e.overriding

public class Polyoverriding {
	public static void main(String[] args) {
		person person= new person();
		person.showdata();
	
		
		//person person= new member();
		//person.showdata();
	
	}

}
