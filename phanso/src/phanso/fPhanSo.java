package phanso;

import java.util.Scanner;

public class fPhanSo {
	double numerator;
	double denominator;
	
	public fPhanSo() {
		
	}
	
	public fPhanSo(double numerator, double denominator) {
		this.denominator = denominator;
		this.numerator = numerator;
	}

	public double getNumerator() {
		return numerator;
	}

	public void setNumerator(double numerator) {
		this.numerator = numerator;
	}

	public double getDenominator() {
		return denominator;
	}

	public void setDenominator(double denominator) {
		this.denominator = denominator;
	}
	// greatest common division : UCLN
	public int gcd(int numerator, int denominator) {
		if(numerator==0 || denominator == 0) {
			return numerator + denominator;
		}
		while(numerator != denominator ) {
			if(numerator > denominator) {
				numerator = numerator - denominator;
			}
			else {
				denominator = denominator - numerator;
			}
		}
		return numerator;
	}
	
	
}
