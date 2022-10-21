package Synchronization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Superclass{
	int i;
	public Superclass(int i) {
		this.i= i;
		
	}
	public Superclass() {
		i=50;
		System.out.println("superclass constructor called");
	}
}
class Subclass extends Superclass implements Serializable{
	int j;
	public Subclass(int i, int j) {
		super(i);
		this.j=j;
		
	}
}



public class SerializationWithInheritance1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Subclass s1= new Subclass(12,34);
		System.out.println("i=" + s1.i);
		System.out.println("j=" + s1.j);
		
		FileOutputStream fos = new FileOutputStream("output.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		System.out.println("object has been seralized");
		
		
		//Deserialized
		FileInputStream fis = new FileInputStream("output.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		Subclass b2=(Subclass) ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println("object has been Deserialized");
		System.out.println("i=" + b2.i);
		System.out.println("j=" + b2.j);
		
		
		
		
	}

}
