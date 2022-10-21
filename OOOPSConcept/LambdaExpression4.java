package OOOPSConcept;



@FunctionalInterface

interface Abc{
	public int add(int p, int q); 
		

}
@FunctionalInterface

interface Xyz{
	public float add(float e, float g);
	
}


public class LambdaExpression4 {
	public static void main(String[] args) {
		Abc d=(p,q)->{
			return p+q;
			
		};
		Xyz f= (e,g)->{
			return e+g;
		};
		int resultint= d.add(20,60);
		System.out.println("resultint");
		
		float resultfloat=f.add(12, 34);
		System.out.println("resultfloat");
	}

}









