package bai6;

import java.util.Scanner;

public class main {
//	int n; la thuoc tinh. this is attribute
	private static Scanner sc;
	public static void main(String[] args) {
		int a;
		sc = new Scanner(System.in);
		System.out.print("enter a= ");
		a = Integer.parseInt(sc.nextLine());
		
		while(a<2) {
			System.out.print("\na > 1 \n enter a again= ");
			a = Integer.parseInt(sc.nextLine());
		}
		if(isPrimeNumber(a)) {
			System.out.println("this is Prime Number "+ a);
//			System.out.println(a + "this is Prime Number "+ Integer.toBinaryString(a)); Co the su dung phuong thuc toBinaryString de biet so nhi phan cua so do
		}
		else 
			System.out.println("this is not Prime Number "+a);
		binary(a);
	}
	public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
	}
	public static void binary(int a){
	      int binary[] = new int[40];
	      int index = 0;
	      while(a > 0){
	        binary[index++] = a%2;
	        a = a/2;
	      }
	      for(int i = index-1;i >= 0;i--){
	        System.out.print(binary[i]);
	      }
	   }
	
}
