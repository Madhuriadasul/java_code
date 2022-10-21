package practice_project;

@FunctionalInterface

interface Functional{
	void ImpOperation();  //single method 
	
}
class StudentEmp{
	void BankOperation() {
		Functional fun= ()->{    //interface_name object = ()->{};
		System.out.println("functional interface code");	
		};
		fun.ImpOperation();  //method call      without name
	}
}
public class LambdaExpression {
	public static void main(String[] args) {
		StudentEmp emp= new StudentEmp();
		emp.BankOperation();
	}

}
