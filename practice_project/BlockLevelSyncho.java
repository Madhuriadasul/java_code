package practice_project;

class Table1 implements Runnable{

	@Override
	public void run() {
		Lock();
		
		
	}
	public void Lock() {
		System.out.println("Outside of synchronization==>"+Thread.currentThread().getName());
		synchronized(this) {
			System.out.println(Thread.currentThread().getName());
			System.err.println("in block"+Thread.currentThread().getName());
			System.out.println("in block" + Thread.currentThread().getName() + "end");
		}
	}
	
}

public class BlockLevelSyncho {
	public static void main(String[] args) {
		Table1 t=new Table1();
		Thread t1= new Thread(t);
		Thread t2= new Thread(t);
		Thread t3= new Thread(t);
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
	}

}
