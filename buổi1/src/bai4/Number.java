package bai4;

import java.util.Scanner;

public class Number {
	int a;
	int b;
	
	
	public Number() {
		
	}
	public Number(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	

	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}
	
	public void input() {
		System.out.print("nhap a= ");
		a = checkA(a);
		System.out.print("nhap b= ");
		b = checkB(b);
	}
	public static int checkA(int a) {
	    Scanner Sc = new Scanner(System.in);
	    boolean check = false;
	    while (!check) {
	        try {
	            a = Sc.nextInt();
	            check = true;
	        } catch (Exception e) {
	            System.out.println("ban nhap sai kieu du lieu \n moi nhap lai : ");
	            Sc.nextLine();
	        }
	    }
	    return a;
	}
	public static int checkB(int b) {
	    Scanner Sc = new Scanner(System.in);
	    boolean check = false;
	    while (!check) {
	        try {
	            b = Sc.nextInt();
	            check = true;
	        } catch (Exception e) {
	            System.out.println("ban nhap sai kieu du lieu \n moi nhap lai : ");
	            Sc.nextLine();
	        }
	    }
	    return b;
	}
	public void total() {
		System.out.print("tong 2 so a va b la "+ (this.getA()+this.getB()));
	}

}
