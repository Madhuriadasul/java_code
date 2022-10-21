package practice_project;

import basicjava.Main;

@FunctionalInterface

interface Functional1{
	void m1(int num1,int num2) ;
		
	}
class EmployeeImp{
	void m2(int num1,int num2) {
		Functional1 fun= (x,y)->{
		int	sum= x+y;
	System.out.println("functional interface code");
	System.out.println(sum);
	};
	fun.m1(num1, num2);
	
}
	
}
interface ST{
	public default void show() {
		System.out.println("show message");
	}
	public static void show1() {
		System.out.println("static method");
	}
	
		
	}


class S1 implements ST{
	public void show() {       //same method
		System.out.println("show method");  
	}
	public static void show1() {
		System.out.println("static mthod");
}
}
public class LambdaWithStatic {
public static void main(String[] args) {
	EmployeeImp em= new EmployeeImp();
	em.m2(10, 12);
	ST s= new S1();
	s.show();
	s.show();
	
}
}
