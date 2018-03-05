package bai3;

import java.util.Arrays;
import java.util.Scanner;

//số lớn nhất và tổng các số thực trong danh sách
public class bai3 {
	public static void main(String[] args) {
		System.out.print("kich thuoc cua mang la: ");
		Scanner Sc = new Scanner(System.in);
		int max = Integer.parseInt(Sc.nextLine());
		float[] mangSoThuc =  new float[max]; 
		int i;
		for(i = 0; i < max; i++) {
			System.out.printf("enter element %d: ", i);
			mangSoThuc[i] = checkInput(mangSoThuc[i]);
			
		}
//		sort(mangSoThuc);
		Arrays.sort(mangSoThuc);
		sum(mangSoThuc);
		
		System.out.println("Dãy số được sắp xếp tăng dần: ");
		show(mangSoThuc);
	}
//	public static void sort(float [] mangSoThuc) {
//        float temp = mangSoThuc[0];
//        for (int i = 0 ; i < mangSoThuc.length - 1; i++) {
//            for (int j = i + 1; j < mangSoThuc.length; j++) {
//                if (mangSoThuc[i] > mangSoThuc[j]) {
//                    temp = mangSoThuc[j];
//                    mangSoThuc[j] = mangSoThuc[i];
//                    mangSoThuc[i] = temp;
//                }
//            }
//            
//        }
//    }
	public static void sum(float mangSoThuc[]) {
		float total = 0;
		for (int i = 0 ; i < mangSoThuc.length; i++) {
              total = total + mangSoThuc[i];
            }
		System.out.println("total " + total );
	}
	public static void show(float mangSoThuc[]) {
		for (int i = 0; i < mangSoThuc.length; i++) {
            System.out.print(mangSoThuc[i] +" " );
        }
		System.out.println("\ngia tri lon nhat " + mangSoThuc[mangSoThuc.length-1]);
		
	}
	public static float checkInput(float a) {
	    Scanner Sc = new Scanner(System.in);
	    boolean check = false;
	    while (!check) {
	        try {
	            a = Sc.nextFloat();
//	            if(a == (int)a) {
//		        	System.out.println("ban nhap sai kieu du lieu \n moi nhap lai : ");
//		            a = Sc.nextFloat();
//		        }
	            check = true;
	        } catch (Exception e) {
	            System.out.println("ban nhap sai kieu du lieu \n moi nhap lai : ");
	            Sc.nextLine();
	        }
	        
	    }
	    return a;
	}
}
