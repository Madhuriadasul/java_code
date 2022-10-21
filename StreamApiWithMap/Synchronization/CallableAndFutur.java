package Synchronization;

import java.security.Provider.Service;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFutur {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exe =Executors.newFixedThreadPool(3);
		Future<Double> f1= exe.submit(new AreaOfCircle (12.5));
		Future<Integer> f2= exe.submit(new FactorialTask(6));
		Future<Double> f3= exe.submit(new CircumOfACircle(12.5));
		
		System.out.println("Area of Circle(radius 12.5) = "+ f1.get());
		System.out.println("Factorial of 7="+ f2.get());
		System.out.println("CircumFerence(redius 12.5)="+f3.get());
		exe.shutdown();
		
	}

}
class AreaOfCircle implements Callable<Double>{
	double rad=0.0;
	
	public AreaOfCircle(double d) {
		rad=d;
		
	}

	@Override
	public Double call() throws Exception {
		
		return Math.PI*rad*rad;
	}
	
}
class CircumOfACircle implements Callable<Double>{
	double rad=0.0;
	
	public CircumOfACircle(double d) {
		rad=d;
	}

	@Override
	public Double call() throws Exception {
		
		
		return 2 * Math.PI *rad;
	}
}
		
class 	FactorialTask	implements Callable<Integer>{

	private int num=0;
	public FactorialTask(int num) {
		this.num=num;
	
	}

	@Override
	public Integer call() throws Exception {
		int prod=1;
		if(num > 1) {
			for(int i=2;i<=num;i++) 
				prod*=i;
				
			}
			return prod;
		
		}
	}
	
		
		
	
	

		
		
		
		
		
		
	
	



