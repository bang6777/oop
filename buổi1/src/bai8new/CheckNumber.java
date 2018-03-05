package bai8new;

import java.util.Arrays;
import java.util.Scanner;

public class CheckNumber {
	int a[];
	int x;
	
	public CheckNumber() {
		this.setA(a);
		this.setX(x);
	}
	public CheckNumber(int a[], int x) {
		this.a= a;
		this.x = x;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("kich thuoc cua mang: ");
		int n = sc.nextInt();
		a = new int[n];
		for(int i = 0; i < n; i++) {
				System.out.printf("enter element %d: ", i);
				a[i] = checkInput(a[i]);	
		}
		System.out.print("nhap x= : ");
		x = checkInput(x);
	}
	public static int checkInput(int a) {
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
	public void count() {
		int count = 0;
		int i = 0;
		for(i = 0; i < a.length; i++) {
			if(a[i] == x) {
				count++;
			}
	}
		System.out.println("So luong x trong list la: "+ count);
	}	
	public void sort() {
		Arrays.sort(a);
	}
	public void display() {
		System.out.println("after sort ");
		for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" " );
        }	
	}
	
}
