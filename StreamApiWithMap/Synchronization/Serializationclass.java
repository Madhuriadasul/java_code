package Synchronization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee{
	private static final long serialVersionUID=3000L;
	private int id;
	private String name;
	private String address;
	
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
		
}
public class Serializationclass {
	public static void main(String[] args) {
		Employee e1 =new Employee( 200,"madhuri","pune");
		String filename="serialized_file";
		try {
			FileOutputStream file= new FileOutputStream(filename);
			ObjectOutputStream out= new ObjectOutputStream(file);
			out.writeObject(e1);
			out.close();
			
			System.out.println("Object has been Serialized");
			
			
			
			
		}catch(IOException e) {
			System.out.println("IOException is caught");
			
		}
	
		Employee object1=null;
		
		try {
			FileInputStream file= new FileInputStream(filename);
			ObjectInputStream in= new ObjectInputStream(file);
			object1=(Employee) in.readObject();
			in.close();
			file.close();
			System.out.println("object has been Deserialized");
			System.out.println("employee id..."+ object1.getId());
			System.out.println("employee name..."+ object1.getName());
			System.out.println("employee address..."+ object1.getAddress());
			
			
			
		}catch(IOException e) {
			System.out.println("IOException is caught");
			
		}catch(ClassNotFoundException e) {
			System.out.println("ClassNotFound is caught");
		}
		
		
		
		
		
		
	}

}
