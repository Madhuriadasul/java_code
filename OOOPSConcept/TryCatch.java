package OOOPSConcept;

public class TryCatch {
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int result=0;
		int pt=10000;
		try {
			pt=10000;
			result = num1 / num2;
			System.out.println("division completed");
		}
		catch(NullPointerException  | ArithmeticException e ) 
		{
			 e.printStackTrace();
			
		}
		finally {
			pt=10000;
			System.out.println("finally block");
		}
			
		
	}

}
