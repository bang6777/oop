package fibonoci;

import java.util.Scanner;

public class Fibonoci {
	int n;
	int a[];
	public static void main(String[] args) {
		Fibonoci f1 = new Fibonoci();
		f1.readNumber();
		f1.createFibonoci();
		f1.show();
	}
	void readNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter n: " );
		n = sc .nextInt();
		a = new int[n];
	}
	void createFibonoci() {
		a[0] = 1;
		a[1] = 1;
		for(int i = 3 ; i < n ; i++) {
			a[i] = a[i-1] + a[i-2];
			}
			
		}
	void show() {
		for(int i = 0; i < n ; i++) {
			if(a[i] <= n)
			System.out.print( a[i] + " ");
		}
		
	}
}
