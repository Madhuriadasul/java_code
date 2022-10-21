package practice_project;
@FunctionalInterface

interface Fun{
	public int m1(String name, int num);
	
	default void m2() {
		System.out.println("m2 method default");
	}
	static void m3() {
		System.out.println("m3 method default");
	}
}
class FunImp1 implements Fun{
	public int m4() {
		Fun fu= (str,num)->{
			System.out.println(str);
			
			int sum= num*num;
			return sum;
			
			
		};
		int result= fu.m1("madhuri",12);
		System.out.println("functional interface result "+ result);
		return result;
		
	}

	@Override
	public int m1(String name, int num) {
		// TODO Auto-generated method stub
		return 0;
	}
}



public class InterfaceFunctionCode {
	public static void main(String[] args) {
		
  

	

}
}