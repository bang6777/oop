package bai8;

import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		int x;
		System.out.print("kich thuoc cua mang la: ");
		Scanner Sc = new Scanner(System.in);
		int max = Integer.parseInt(Sc.nextLine());
		int[] list =  new int[max]; 
		int i;
		for(i = 0; i < max; i++) {
			System.out.printf("enter element %d: ", i);
			list[i] = Integer.parseInt(Sc.nextLine());
		}
		System.out.print("enter x = ");
		x = Integer.parseInt(Sc.nextLine());
		CheckNumberInList check = new CheckNumberInList(list, i);
		check.checkNumber(list, x);
		check.sort(list);
		check.show(list);
	}
}
