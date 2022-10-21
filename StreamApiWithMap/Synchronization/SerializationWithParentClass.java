package Synchronization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent implements Serializable{
	int i;
	public Parent(int i) {
		this.i=i;
		
		
	}
}
 class Child extends Parent{
	 int j;
	 public Child(int i,int j) {
	 super(i);
	 this.j= j;
	 
 }
	 private void  writeObject(ObjectOutputStream out) throws IOException{
		 throw new NotSerializableException();
		 
	 }
	 private void  readObject(ObjectInputStream out) throws IOException{
		 throw new NotSerializableException();
 }
 }
public class SerializationWithParentClass {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Child c1= new Child(10,50);
		System.out.println("i=" + c1.i);
		System.out.println("j=" + c1.j);
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		oos.writeObject(c1);
		oos.close();
		fos.close();
		
		System.out.println("object has been seralized");
		
		
		//Deserialized
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		Child b2=(Child) ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println("object has been Deserialized");
		System.out.println("i=" + b2.i);
		System.out.println("j=" + b2.j);
		
	}

}
