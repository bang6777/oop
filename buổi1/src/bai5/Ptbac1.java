package bai5;

import java.lang.invoke.SwitchPoint;

public class Ptbac1 {
	float a;//tham so cua pt bac 1
	float b;
	
	
	
	public Ptbac1(float a, float b) {
		this.a = a;
		this.b = b;
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
	public void solve(float a, float b) {
		if(a == 0) {
			switch ((int)b) {
			case 0:
				System.out.println("phuong trinh co vo so nghiem");
				break;

			default:
				System.out.println("phuong trinh co vo nghiem");
				break;
			}
			}
		if(a != 0 && b != 0) {
			System.out.printf("nghiem cua phuong trinh la x = %f ", -b/a);
		}
		}
		
	
}
