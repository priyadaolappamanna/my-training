package com.obsqura.revision;

public class childovrrdng extends polyovrrdng {

	public static void main(String[] args) {
		polyovrrdng ob=new childovrrdng();
		ob.show();
		
	}

	@Override
	public void show() {
		
		//super.show();
		System.out.println("child class method");
	}

}
