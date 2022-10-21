package Synchronization;
class Bikes  implements Runnable{

	@Override
	public void run() {
		testloop1();
			
	}
		synchronized void testloop() {
			for(int i=0;i<12;i++) {
				System.out.println(Thread.currentThread().getName() + "thread" + i);
			}
			
		}
		void testloop1() {
			for(int i=0;i<12;i++) {
				System.out.println(Thread.currentThread().getName() + "thread" + i);
			}
			synchronized (this) {
				for(int i=0;i<12;i++) {
				
					System.out.println(Thread.currentThread().getName() + "thread" + i + "synchronized for loop");	
				}
			}
			
		}
		
		
	}
	


public class Synchronizedcode {
	public static void main(String[] args) {
		Bikes bk= new Bikes();
		Thread t1=new Thread(bk);
		Thread t2= new Thread(bk);
		Thread t3= new Thread(bk);
		
		t1.start();
		t2.start();
		t3.start();
		}

}
