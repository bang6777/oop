package bai7;


public class HandleString {
	String fullName;
	
	public HandleString() {
		this.setFullName(fullName);
	}
	public HandleString(String fullName) {
		this.fullName = fullName;
	}
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void cutName(String fullName) {
		String[] name = fullName.split(" ");
		System.out.print("Xin chao: " + name[name.length-1]);
	}
	String getName() {
		String name = new String(fullName.trim());
		return name = fullName.substring(fullName.lastIndexOf(" ")+1);
	} 
	
	
}
