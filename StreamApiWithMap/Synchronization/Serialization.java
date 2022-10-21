package Synchronization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Serialization {
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		try {
			ObjectInputStream in= new ObjectInputStream (new FileInputStream("output.txt"));
			Serialization e1=(Serialization)in.readObject();
			Serialization e2=(Serialization)in.readObject();
			Serialization e3=(Serialization)in.readObject();
			
			
			System.out.println(e1.id+" "+e1.name);
			System.out.println(e2.id+" "+e2.name);
			System.out.println(e3.id+" "+e3.name);
			
			in.close();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
