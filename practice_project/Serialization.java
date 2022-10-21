package practice_project;
import java.io.*;

class Demo implements java.io.Serializable{
private static final long serialaVersionUID=1L;
public int a;
public String b;

//default constructor

public Demo(int a,String b) {
	this .a= a;
	this.b=b;
	
}
	
	
}
class Test{
	public static void main(String[] args) {
		Demo object= new Demo(1,"geeksforgeeks");
		
	}
}

public class Serialization {

}
