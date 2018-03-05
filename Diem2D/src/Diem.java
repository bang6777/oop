
import java.util.Scanner;

public class Diem {
	private int x,y;
	
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
		System.out.print("nhap hoanh do X= ");
		x = Integer.parseInt(Sc.nextLine());
		System.out.print("nhap tung do Y= ");
		y = Integer.parseInt(Sc.nextLine());
	}
	public void hienThi() {
		System.out.print("(" + getX()+","+getY()+")\n");
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
		this.x = hoanhDo;
		this.y = tungDo;
		return this;
	}
	public Diem doiXung(Diem kq) {
//		Diem kq = new Diem();
		kq.ganToaDo(-x,-y);
		return kq;
	}
	public void set(int x1,int y1){
		x = x1;
		y = y1;
	}
	public float distance() {
		float khoangCach = (float) Math.sqrt(Math.pow(this.giaTriX(), 2)+Math.pow(this.giaTriY(),2));
		System.out.println("khoang cach cua B den O: "+khoangCach);
		return khoangCach;
	}
	public double distance(Diem D) {
		return Math.sqrt(Math.pow(x-D.x, 2)+Math.pow(y-D.y,2));
	}
}
