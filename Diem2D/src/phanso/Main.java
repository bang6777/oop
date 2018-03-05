package phanso;

import java.util.Scanner;

public class Main {
	static fPhanSo phanso1 = new fPhanSo();
	static fPhanSo phanso2 = new fPhanSo();
	public static void main(String[] args) {
		checkfraction();
//		System.out.println(phanso1.gcd(numerator,denominator));
	}
	
	
	
	
	public static void checkfraction() {
		Scanner Sc = new Scanner(System.in);
		int numerator, denominator;
		numerator = Integer.parseInt(Sc.nextLine());
		denominator = Integer.parseInt(Sc.nextLine());
		
		if(phanso1.gcd(numerator, denominator) == 1 ) {
			System.out.print(numerator+"/"+denominator+" la phan so toi gian ");
		}else {
			System.out.print(numerator+"/"+denominator+" la phan so chua toi gian ");
		}
	}
}