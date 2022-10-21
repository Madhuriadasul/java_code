package OOOPSConcept;
interface Human{
	
	public  void dispy() ;
		
	
	
}
 class Mango implements Human{

	@Override
	public void dispy() {
		// TODO Auto-generated method stub
		System.out.println("human eating mango");
		System.out.println("mn");
	}
	 
 }
public class Abstraction5 {
	public static void main(String[] args) {
		Human hm= new Mango();
		hm.dispy();
		
	}

}
