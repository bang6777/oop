package bai5;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		float a,b,c;
		Scanner Sc = new Scanner(System.in);
		System.out.print("nhap a= ");
		a = Sc.nextFloat();
		System.out.print("nhap b= ");
		b = Sc.nextFloat();
		System.out.print("nhap c= ");
		c = Sc.nextFloat();
		Ptbac1 pt1 = new Ptbac1(a, b);
		Ptbac2 pt2 = new Ptbac2(a, b, c);
		System.out.print("\n---------phuong trinh bac 1 ---------\n");
		pt1.solve(a, b);
		System.out.print("\n---------phuong trinh bac 2 ---------\n");
		pt2.solve(a, b, c);
	}
}
