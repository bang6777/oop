package bai5;

public class Ptbac2 {
	float a,b,c; // tham so cua pt bac 2
	
	public Ptbac2(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}
	
	public void solve(float a, float b, float c) {
		double delta;
		double x1;
		double x2;
		delta =  (float) (b*b - 4*a*c);
		if(delta > 0) {
			x1 = ((-b + Math.sqrt(delta))/2*a);
			x2 = ((-b - Math.sqrt(delta))/2*a);
			System.out.print("x1=  "+x1);
			System.out.print("\nx2=  "+x2);
		}else if(delta < 0) {
			System.out.println("phuong trinh vo nghiem ");
			
		}else System.out.printf("x1=x2= %f", -b/2*a);
			
	}
	
}
