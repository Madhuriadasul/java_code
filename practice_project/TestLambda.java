package practice_project;
@FunctionalInterface        // One Lambda inside Another Lambda is Possible

interface TestFunctional{
	public int calculate(int x,int y);
	
}
@FunctionalInterface
interface TestInterface{
	public int cal(int x,int y);
}
class Text{
	public void disp() {
		System.out.println("disply method in text");
	}
}
public class TestLambda {
	public static void main(String[] args) {
		TestFunctional fun1= (a,b)->{
		Text t1= new Text();
		t1.disp();
		TestInterface fun2=(c,d)->{
			return c+d;
		};
		System.out.println("Internal lambda function call");
		int result=fun2.cal(30,40);
		System.out.println("internal lambda function result==>"+result);
		return a+b;
		
		};
		int result= fun1.calculate(12,13);
		System.out.println(result);
	}

}
