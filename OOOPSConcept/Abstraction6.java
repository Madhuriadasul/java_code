package OOOPSConcept;
abstract class Cat{
	public abstract void dispCat();
	public void disp() {
		System.out.println("disp the cat methaod");
	}
	
}
class Dog extends Cat{
	public void dispCat() {
		System.out.println("disp the Dog method");
	}

		
	}

public class Abstraction6 {
	public static void main(String[] args) {
		Cat ca= new Dog();
		ca.disp();
		ca.dispCat();
	}

}
