package practice_project;

public class Array2 {
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int arr[]= {10,23,45,65,34};
		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
		System.out.println("arr[3] " + arr[3]);
		
		
		for(int i=1;i<arr.length;i++) {
			System.out.println("index...."+ i + "value...." + arr[i]);
		}
	}

}
