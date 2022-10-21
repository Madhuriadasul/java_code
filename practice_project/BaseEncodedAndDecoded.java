package practice_project;

import java.util.Base64;

public class BaseEncodedAndDecoded {
	public static void main(String[] args) {
	Base64.Encoder encoder = Base64.getEncoder();
	Base64.Decoder decoder= Base64.getDecoder();
	
	//Encoded String
	
	String name= "Madhuri";
	System.out.println("byte code...."+ name.getBytes());
	String str= encoder.encodeToString(name.getBytes());
	System.out.println("Encoded string :" + str);
	
	//Decoded String
	
	byte[] b= decoder.decode(str);
	String dstr= new String(b);
	System.out.println("Decoded string : "+ dstr);
	}

}
