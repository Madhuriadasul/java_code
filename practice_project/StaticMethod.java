package practice_project;
class FM{
	public static void m1() {
		System.out.println("m1 method from fm");
	}
	public void m2() {
		System.out.println("m2 method from fm");
	}	
}

class Fm2 extends FM{
	                  // no method 
}



public class StaticMethod {
	public static void main(String[] args) {
		Fm2 fm= new Fm2();
		fm.m2();   //its alluded
		fm.m1();
	}

}
