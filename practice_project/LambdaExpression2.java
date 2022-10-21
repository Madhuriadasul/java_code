package practice_project;

@FunctionalInterface

interface Functionality{
	void m1(int num1,int num2);
}
class EmployeeSet{
	void m2(int num1,int num2) {
		Functionality fy=(p,q)->{
		int	multiply=p*q;
			System.out.println("functional interface code");
			System.out.println(multiply);
	};
	fy.m1(num1, num2);
}
}

public class LambdaExpression2 {
public static void main(String[] args) {
	EmployeeSet es= new EmployeeSet();
	es.m2(6,6);
}
}
