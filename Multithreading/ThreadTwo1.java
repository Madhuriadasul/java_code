package Multithreading;
class ThreadOne implements Runnable{
	int num;
 ThreadOne(int num) {
	this.num=num;
	
	
	}
	class ThreadTwo extends Thread{
		
	}
	@Override
	public void run() {
		
		for(int i= 0;i<=num;i++)
			{
				
				System.out.println(Thread.currentThread().getName()+"priority " +Thread.currentThread().getPriority());
				
			System.out.println("i value.."+i);
		}
	}
}

	class ThreadThree extends Thread{
		
		@Override
		public void run() {
			
			for(int i= 0;i<=7;i++)
				{
					
					System.out.println(Thread.currentThread().getName()+"priority " +Thread.currentThread().getPriority());
					
				System.out.println("i value.."+i);
			}
     }
	
	
}


public class ThreadTwo1 {
	public static void main(String[] args){
		ThreadOne t2= new ThreadOne(7);
		
		
		Thread t1= new Thread(t2);
		t1.start();
		
		ThreadThree t3= new ThreadThree();
		t3.start();
		
		
		
		
	}
	

}


