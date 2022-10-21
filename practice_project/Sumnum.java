package practice_project;

import java.util.Scanner;

public class Sumnum {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("sum=" +sum);
	}

}
