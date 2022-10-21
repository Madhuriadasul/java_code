package practice_project;
interface Ft{
	default void m1() {
		System.out.println("default method from ft");
	}
	static void m2() {
		System.out.println("m2 method from ft");
	}
}
interface Fr{
	default void m1() {
		System.out.println("default method from fr");
	}
	static void m2() {
		System.out.println("m2 method from fr");
	}
	
}	
class xyz{   //multiple inheritance use than with the help of interface and class
	
}
	
class TableTd1 extends xyz implements  Ft,Fr{       // , Separated interface

	@Override
	public void m1() {                              // public void m2() its not alluded
		System.out.println("method from tabletd class");
		
	}
	
	
}

public class DefaultAndStaticMethod1 {
public static void main(String[] args) {
	TableTd1 td= new TableTd1();
	td.m1();
	Ft.m2();
	
}
}
