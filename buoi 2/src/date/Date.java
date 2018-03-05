package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Date {
	private int ngay,thang,nam;
	
	
	public Date() {
		
	}
	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public void showDate() {
		System.out.print(getNgay()+"/"+getThang()+"/"+getNam());
	}
	public void enterDate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter day: ");
		ngay = Integer.parseInt(sc.nextLine()); 
		System.out.print("enter month: ");
		thang = Integer.parseInt(sc.nextLine()); 
		System.out.print("enter year: ");
		nam = Integer.parseInt(sc.nextLine()); 
		
	}
	public boolean checkDate() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df = new SimpleDateFormat("dd MM yyyy");
		df.setLenient(false); // set false để kiểm tra tính hợp lệ của date. VD: tháng 2 phải có 28-29 ngày, năm có 12 tháng,....
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ngay thang nam: ");
		String dateString = sc.nextLine();
		try {
		    df.parse(dateString); // parse dateString thành kiểu Date
		    System.out.println("ngay thang nam hop le");
		}
		catch (ParseException e) { // quăng lỗi nếu dateString ko hợp lệ
		   System.out.println("Invalid date");
		
		}
		return true;
	}
	public Date nextDate() {
		Date D = null;
		return D;
	}
	public Date addDate(int n) {
		Date D = null;
		return D;
	}
}
