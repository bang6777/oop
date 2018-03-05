package ManagerStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
//	private static Student student = null;
	
	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("co bao nhieu SV: ");
		int n =sc.nextInt();
		
		Student[] st = new Student[n] ;
		for(int i = 0 ; i < n; i++) {
			st[i] = new Student();
			st[i].input();
		}
		for(int i = 0; i < n ; i++) {
			nameList.add(st[i].getname());
		}
		Collections.sort(nameList);
		System.out.println("Danh sach sv da sap xep "+nameList.toString());
		System.out.println("Danh sach sv da sap xep "+nameList.toString());
		for(int i = 0; i < n ; i++) {
			st[i].ShowInformation();
		}
		
		
		
		
		
		
		
	}
}
//		Scanner Sc = new Scanner(System.in);
//		int functionID = 0;
//		//boolean flag = true;
//		do {
//			ShowMenu();
//			functionID = Sc.nextInt();
//			Sc.nextLine();
//			switch(functionID)
//		    {
//		       case 1 :
//		    	  AddStudent();
//		          break;
//		       case 2 :
//		    	   EditStudent();
//		    	   break;
//		       case 3 :
//		          DeleteStudent();
//		          break;
//		       case  4:
//		    	   SortByScore();
//		          break;
//		       case 5 :
//		          SortByName();
//		          break;
//		       case 6 :
//			      ShowStudent();
//			      break;
////		       default :
////		          flag = false;
//		    }
////			if (functionID == 0) flag = false;
//		}while(functionID != 0);
//		
//		Sc.close();
//		
//	}
//	public static void ShowMenu() {
//		System.out.println("------------Menu------------");
//		System.out.println("1. Add student.");
//		System.out.println("2. Edit student by id.");
//		System.out.println("3. Delete student by id.");
//		System.out.println("4. Sort student by medium Score.");
//		System.out.println("5. Sort student by name.");
//		System.out.println("6. Show student.");
//		System.out.println("0. Exit.");
//	}
//	public static void AddStudent() {
//		Scanner Sc = new Scanner(System.in);
//		String ID 	=	"";
//		String name = "";
//		int age = 0;
//		double mediumScore = 0;
//		System.out.print("Enter Student ID: ");
//		ID = Sc.nextLine();
//		System.out.print("Enter Student Name: ");
//		name = Sc.nextLine();
//		System.out.print("Enter Student Old: ");
//		age = Sc.nextInt();
//		Sc.nextLine();
//		System.out.print("Enter Student Medium Score: ");
//		mediumScore = Sc.nextDouble();
//		student = new Student(ID, name, age, mediumScore);
//		Sc.close();
//
////		student.ShowInformation();
//	}
//	public static void EditStudent() {
//		if(student != null) {
//			Scanner Sc = new Scanner(System.in);
//			String ID 	=	"";
//			String name = "";
//			int age = 0;
//			double mediumScore = 0;
//			System.out.print("Enter new Student Medium Score: ");
//			mediumScore = Sc.nextDouble();
//			student.setmediumScore(mediumScore);
//			}else System.out.printf("List is empty");
//	}
//	public static void DeleteStudent() {
//		if(student != null) {
//			
//			}else System.out.printf("List is empty");
//	}
//	public static void SortByScore() {
//		
//	}
//	public static void SortByName() {
//		
//	}
//	public static void ShowStudent() {
//		if(student != null) {
//		student.ShowInformation();
//		}else System.out.printf("List is empty");
//	}
//}
