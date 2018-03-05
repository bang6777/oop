package bai7;

import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		String fullName;
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter your full name ");
		fullName = Sc.nextLine();
		HandleString handle1 = new HandleString();
		handle1.cutName(fullName);
//		handle1.handle(fullName);
//		String name = fullName.substring(fullName.trim().lastIndexOf(" ")+1);
//		System.out.print("hello "+name);
		
	}
}
