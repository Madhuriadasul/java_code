package OOOPSConcept;



abstract class Master{
	public  abstract void dispMaster() ;
	
	public void dispMaster1() {
		// TODO Auto-generated method stub
		
	}

	public void disp() {
		System.out.println("display on Master class");
	}
		
	}
		
	class MasterImp extends Master{
		public void dispMaster() {
			System.out.println("MasterImp class");
				
			}

		@Override
		public void dispMaster1() {
			// TODO Auto-generated method stub
			
		}
		}
		
	


public class Abstraction4 {
	public static void main(String[] args) {
		Master mn= new MasterImp();
		mn.disp();
	mn.dispMaster();
	}

}
