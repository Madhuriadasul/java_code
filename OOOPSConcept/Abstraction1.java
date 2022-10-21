package OOOPSConcept;
interface Drawing{
	void draw() ;
		
	
}
 class Rectangle implements Drawing{
	 public void draw() {
		 System.out.println("Drawing Rectangle");
	 }
	 
	 
 }	 
 class Circle implements Drawing{
		 public void draw()
		 {
			 System.out.println("Drawing Circle");
		 }
		 
	 
 }
 

 
public class Abstraction1 {
	public static void main(String[] args) {
		Drawing d= new Circle();
		d.draw();
		
	}

}
