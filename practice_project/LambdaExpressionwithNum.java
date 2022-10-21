package practice_project;
  
@FunctionalInterface

interface FunctionalIn{
	void FundTransfer(int num1, int num2);
}


class Employee {
	void BankOperation(int num1,int num2) {
		FunctionalIn fun=(a,b)-> {  //Lambda Expression
		int sum= a+b;
		
		System.out.println("functional interface code");
		System.out.println(sum);
	};
	fun.FundTransfer(num1, num2);
}
}
public class LambdaExpressionwithNum {
	public static void main(String[] args) {
		
	Employee emp= new Employee();
	emp.BankOperation(12,13);
	}

}
