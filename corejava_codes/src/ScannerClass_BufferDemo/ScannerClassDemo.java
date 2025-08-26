package ScannerClass_BufferDemo;

import java.util.Scanner;
public class ScannerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		System.out.println(name);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		System.out.println(age);
		scan.close();

	}

}
