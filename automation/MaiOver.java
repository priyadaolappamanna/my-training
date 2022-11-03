package com.obsqura.automation;

public class MaiOver extends overridingg {
	

	@Override
	public void show() {
		
		//super.show();
		System.out.println("printing child class method");
	}

	public static void main(String[] args) {
		overridingg ob=new MaiOver();
		ob.show();
		
	}

}
