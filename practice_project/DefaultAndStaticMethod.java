package practice_project;

interface f1{
	default void m1() {
		System.out.println("default method from f1 ");
	}
	static void m2() {
		System.out.println("m2 method from f1");
	}
}
interface f2{
	default void m1() {
	System.out.println("default method from f2 ");
	}
	static void m2() {
		System.out.println("m2 method from f2");
	}
	
}
//class TableTd implements f1{                    //Op .......default method from f1
class TableTd implements f2{                     //....then op is default method from f2
	
	
	
}

public class DefaultAndStaticMethod {
public static void main(String[] args) {
	TableTd t= new TableTd();
	t.m1();
}
}
