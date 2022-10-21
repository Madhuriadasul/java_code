package Synchronization;
class FundTransfer implements Runnable{

	@Override
	public void run() {
		forloop1();
		
		
	}
	public synchronized void forloop() {
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		for(int i=0;i<12;i++) {
			System.out.println(Thread.currentThread().getName() +" index value" + i +"in Synchronized block");
		}
	}
	public void forloop1() {
		for(int i=0;i<12;i++) {    //non synchronized
			System.out.println(Thread.currentThread().getName() + "index value" + i);
			
		}
		synchronized(this) {
			try {
				Thread.sleep(200);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			for (int i=0;i<12;i++) {
				System.out.println(Thread.currentThread().getName() +" index block " + i  + "in Synchronized block");
			}
		}
		
	}
}
public class Synchroniza {
	public static void main(String[] args) {
		FundTransfer ft1= new FundTransfer();
		Thread t1= new Thread(ft1);
		Thread t2= new Thread(ft1);
		Thread t3= new Thread(ft1);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
