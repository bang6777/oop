package toado;

import java.util.Scanner;

public class Diem {
	int x,y;
	
	public Diem() {
		this.setX(x);
		this.setY(y);;
	}
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void nhapDiem() {
		Scanner Sc = new Scanner(System.in);
		System.out.printf("nhap hoanh do X= ");
		x = Integer.parseInt(Sc.nextLine());
		System.out.printf("nhap tung do Y= ");
		y = Integer.parseInt(Sc.nextLine());
	}
	public void hienThi() {
		System.out.printf("(%d,%d)\n",getX(),getY());
	}
	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}
	public int giaTriX() {
		x = getX();
		return x;
	}
	public int giaTriY() {
		y = getY();
		return y;
	}
	public Diem ganToaDo(int hoanhDo,int tungDo) {
		this.x = x;
		this.y = y;
		return this;
	}
	public Diem doiXung(Diem kq) {
//		Diem kq = new Diem();
		kq.ganToaDo(-x,-y);
		return kq;
	}
	public float distance() {
		float khoangCach = (float) Math.sqrt(Math.pow(this.giaTriX(), 2)+Math.pow(this.giaTriY(),2));
		System.out.println("khoang cach cua B den O: "+khoangCach);
		return khoangCach;
	}
	public double distance(Diem D) {
		double kq = Math.sqrt(Math.pow(x-D.x, 2)+Math.pow(y-D.y,2));
		return kq;
		
	}
}
