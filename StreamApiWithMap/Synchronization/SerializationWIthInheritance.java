package Synchronization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable{
	int i;
	public A(int i) {
		this.i=i;
		
	}
}
class B extends A{
	int j;
	public B(int i,int j) {
		super(i);
		this.j=j;
		
	}
}




public class SerializationWIthInheritance {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		B b1= new B(12,34);
		System.out.println("i =" + b1.i);
		System.out.println("j =" + b1.j);
		
		FileOutputStream fos= new FileOutputStream("abc.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		oos.writeObject(b1);
		oos.close();
		fos.close();
		
		System.out.println("object has been serialized");
		//DeSerializable
		
		FileInputStream fis= new FileInputStream("abc.ser");
		ObjectInputStream oop= new ObjectInputStream(fis);
		
		B b2=(B) oop.readObject();
		oop.close();
		fis.close();
		
		System.out.println("object has been Deserialized");
		System.out.println("i =" + b2.i);
		System.out.println("j =" + b2.j);
		
		
		
		
	}

}
