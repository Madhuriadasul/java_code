package practice_project;
 abstract class Bike1{
	Bike1()
	 
		{ System.out.println("my first bike");}
	 
	 abstract void run();
	 void changegear()
	 { System.out.println("change the gear");}
		 
 }
	 class Honda extends Bike1{
		 void run() 
		 {System.out.println("running safely");}
			 
		 }
		 
 
	 
	

public class Abstraction1 {
	public static void main(String[] args) {
		Bike1 obj=new Honda();
		obj.run();
		obj.changegear();
	}

}
