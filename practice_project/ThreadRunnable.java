package practice_project;
class StudentID extends Thread{

	
	@Override
	public void run() {
		for(int i= 0;i<5;i++) {
			System.out.println("value of i..."+ i);
			try {
				Thread.sleep(500);
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	
}
public class ThreadRunnable {
	public static void main(String[] args) {
		StudentID st1= new StudentID();
		StudentID st2= new StudentID();
		StudentID st3= new StudentID();
		
		
		st1.start();
		st2.start();
		st3.start();
		
		
	}
	
	

}
