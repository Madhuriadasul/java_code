package OOOPSConcept;
class sy{
	public void reed() {
		System.out.println("reading book xyz");
		
	}
public void read(String bookname) {
	System.out.println("reading " + bookname +" book" );
		
	}
}
//Polymorphism  compiletimerun i.e overloading

public class Polyoverloading {
	public static void main(String[] args) {
		sy s1=new sy();
		s1.reed();
		s1.read("java basic");
	}

}
