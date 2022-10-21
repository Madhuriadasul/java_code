package Synchronization;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

 class StudentEmp1 implements Callable<Integer>{
	  int number=0;
	  
	  public StudentEmp1(int number) {
			super();
			this.number=number;
	}
		
													//future chi get method..
	@Override
	public Integer call() throws Exception {     //Callable chi Call method ...
		
		int result=0;
		
		for(int i=0;i<number;i++) {
			result=result+i;
		
		}
											
		return result;
		
		}
		
		
		
	
}

public class CallableAndFuture {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	     //step 1: executer service framework with fixed with fixed
	
	ExecutorService exe=Executors.newFixedThreadPool(5);
	
	StudentEmp1 obj1= new StudentEmp1(10);
	Future <Integer>f1 =exe.submit(obj1);
	Integer output=f1.get();
	
	
	StudentEmp1 obj2=new StudentEmp1(9);
	Future <Integer> f2=exe.submit(obj2);
	Integer output1=f2.get();
	
	System.out.println(output);
	System.out.println(output1);
	
	
	
	
	
}
}
