package OOOPSConcept;
abstract class Employee{
	public abstract void dispEmployee();
	public void disply1() {
		System.out.println("disply1 method in Employee class");
	}
	
	
}

class EmployeeImp extends Employee{
	@Override
	public void dispEmployee() {
		System.out.println("abstract method");
	}
	
	
}
public class Abstraraction2 {
	public static void main(String[] args) {
		Employee em= new EmployeeImp();
		em.disply1();
		em.dispEmployee();
	}

}
