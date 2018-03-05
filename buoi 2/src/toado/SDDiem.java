package toado;

import java.util.Scanner;

public class SDDiem {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Diem A = new Diem();
		A.nhapDiem();
		System.out.print("toa do diem A\n");
		A.hienThi();
		
		Diem B = new Diem();
		B.nhapDiem();
		System.out.print("toa do diem B");
		B.hienThi();
//		int hoanhDoC = -B.getX();
//		int tungDoC = -B.getY();
//		Diem C = new Diem(hoanhDoC,tungDoC);
		Diem C = new Diem();
		C.doiXung(B);
		System.out.print("C");
		C.hienThi();
		B.distance();
		Diem D = new Diem();
//		khoang cach tu A - B
		System.out.print("Distance from A to B: "+ A.distance(B));
		
	}
}
