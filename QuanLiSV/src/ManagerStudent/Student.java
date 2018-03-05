package ManagerStudent;

import java.sql.Struct;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Student {
	
//	public String id;
	private String name; 
//	private int age;
	private double mediumScore;
	
	public Student( ) {
//		this.setid(id);
		this.setname(name);
//		this.setage(age);
		this.setmediumScore(mediumScore);
	}
	public Student(String name, double mediumScore) {
		this.name = name;
		this.mediumScore = mediumScore;
	}
	
	
//	public void setid(String id) {
//		this.id = id;
//	}
//	public String getid() {
//		return id;
//	}
	
	
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	
//	
//	public void setage(int age) {
//		this.age = age ;
//	}
//	public int getage() {
//		return age;
//	}
	
	
	public void setmediumScore(double mediumScore) {
		this.mediumScore = mediumScore;
	}
	public double getmediumScore() {
		return mediumScore;
	}
	public void input() {
		Scanner sc =new Scanner(System.in);
		System.out.println("nhap vao ho ten SV ");
		name = sc.nextLine();
		System.out.println("nhap diem trung binh cua SV ");
		mediumScore = sc.nextDouble();
	}
	public void sortByName() {
		Student st = new Student();
//		Collections.sort(st.name);
		
	}
	public void deleteAllNameX(String name) {
		
	}
	public void cutName(String fullName) {
		String[] name = fullName.split(" ");
		System.out.print("Xin chao: " + name[name.length-1]);
	}
	public void ShowInformation() {
		System.out.print("Ten cua SV: \t"+this.getname());
		System.out.println("Diem TB cua SV: \t"+this.getmediumScore());
		System.out.println("");

	}
}
