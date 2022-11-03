package com.obsqura.assignment.inheritance;



public class RBI {

	private double rateOfInterest;

	public RBI() {
		this.rateOfInterest = 8.5;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public static void main(String[] args) {

		RBI r1 = new SBI(); // up casting
		RBI r2 = new HDFC(); // up casting

		System.out.println(r1.getRateOfInterest());
		System.out.println(r2.getRateOfInterest());

	}
}

class SBI extends RBI {

}

class HDFC extends RBI {

	public double getRateOfInterest() {
		return super.getRateOfInterest() * 1.5;
	}
}
