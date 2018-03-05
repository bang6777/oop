import java.util.Scanner;

public class people {
	String name;
	String address;
	int age;
	
	public people() {
		
	}

	public people (String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
		
	}
//	get+set
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


//	Method
	public void Information() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter your name Student: ");
		name = Sc.nextLine();
		System.out.println("enter your address Student ");
		address = Sc.nextLine();
		System.out.println("enter your old Student ");
		age = Sc.nextInt();
		
		}	
 
	public void ShowInfor() {
		System.out.println("your name Student: " + this.getName());
		System.out.println("your ID Student: "+ this.getAddress());
		System.out.println("your age Student: "+ this.getAge());
	}
}
