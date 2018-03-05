import java.util.Scanner;

public class SV extends people {
	
	double scoresmath, scoresbiology, scoresphysical;
	String ID;
	String NameClass;
	
	
//	Constructor
	public SV() {
		
	}
	
	public SV(String name, String address, int age) {
		super(name, address, age);
		this.ID = ID;
	}
	@Override
	public void Information() {
		Scanner Sc = new Scanner(System.in);
		super.Information();
		System.out.println("enter your ID student ");
		ID = Sc.nextLine();
		System.out.println("enter your Scores math of student ");
		scoresmath = Integer.parseInt(Sc.nextLine());
		System.out.println("enter your Scores biology of student ");
		scoresbiology = Integer.parseInt(Sc.nextLine()); 
		System.out.println("enter your Scores physical of student ");
		scoresphysical = Integer.parseInt(Sc.nextLine()); 
	}
	public void ShowInfor() {
		super.ShowInfor();
		System.out.println("your ID of student "+ this.ID);
		System.out.println("your Scores math of student "+ this.scoresmath);
		System.out.println("your Scores biology of student "+ this.scoresbiology);
		System.out.println("your Scores physical of student "+ this.scoresphysical);
	}
	public double mediumScore() {
		double mediumScore;
		return mediumScore =(double) ((scoresmath + scoresbiology + scoresphysical )/3);
	}
	
}
