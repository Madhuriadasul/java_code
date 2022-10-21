package practice_project;
class StudentImp implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			
		System.out.println("value of i..."+ i);
		try {
			Thread.sleep(300);
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	}
	
	
	
}
public class ThreadRunnable2 {
	public static void main(String[] args) {
		StudentImp sp1= new StudentImp();
		StudentImp sp2= new StudentImp();
		StudentImp sp3= new StudentImp();
		
		Thread t1= new Thread(sp1);
		Thread t2= new Thread(sp2);
		Thread t3= new Thread(sp3);

		t1.start();
		t2.start();
		t3.start();
		
	}

}
