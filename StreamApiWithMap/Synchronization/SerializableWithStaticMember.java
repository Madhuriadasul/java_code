package Synchronization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import basicjava.Main;

public class SerializableWithStaticMember implements Serializable {
	static int i= 100;
	public static void main(String[] args) {
		SerializableWithStaticMember ob= new SerializableWithStaticMember();
		System.out.println("static member has value: " + i);
		
		try {
			FileOutputStream fos= new FileOutputStream("File.ser");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(ob);          //serializing saving the state value of the object ob
			oos.close();
			i=99;   //static member value is changed..
			
			
			//Deserializeation
			
			FileInputStream fis= new FileInputStream("File.ser"); 
			ObjectInputStream ois= new ObjectInputStream(fis);
			ob=(SerializableWithStaticMember )ois.readObject();  // Deserializing ..restoring the object to its original..
			ois.close();
			System.out.println("after deserialized static value is " + i);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
