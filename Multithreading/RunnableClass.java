package Multithreading;
class Three implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println("Prient therr method");
		}
	}
	
}
public class RunnableClass {
	public static void main(String[] args) {
		Three t1= new Three();
		Thread t2= new Thread(t1);
		t2.start();
		try {
			t2.join();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<5;i++) {
			System.out.println("main Thread");
		}
	}

}
