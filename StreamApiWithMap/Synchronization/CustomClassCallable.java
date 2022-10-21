package Synchronization;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;






class Mobile{
	private static int id;
	private String model;
	private static double price;
	public Mobile(int id, String model, double price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
	}
	public static int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public static double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

class Mobilecallable implements Callable<Mobile>{

	public Mobilecallable(Mobile m) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Mobile call() throws Exception {
	Mobile mb=new Mobile(2, "MI", 6000);
	mb.setId(Mobile.getId()*10);
	mb.setPrice(Mobile.getPrice()-300);
	return mb;
	
	}
	
}

public class CustomClassCallable {
	public static void main(String[] args) throws InterruptedException,ExecutionException {
		ExecutorService exe= Executors.newFixedThreadPool(5);
		Mobile m =new Mobile(20,"Apple",303000);
		Mobilecallable cal= new Mobilecallable(m);
		Future<Mobile> f=exe.submit(cal);
		Mobile mm= f.get();
		System.out.println(mm);
		
	}

}
