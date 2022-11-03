package com.obsqura.abstractpgm;

public class InterMain {

	public static void main(String[] args) {
		Player p1=new VLCMediaPlayer();//Up Casting
		p1.play();
		p1.pause();
		p1.stop();
		
		Player p2=new TapeRecord();
		p2.play();
		p2.pause();
		p2.stop();
		Recorder p3=new TapeRecord();
//Recorder p3=(Recorder)p2;//Type casting
p3.record();
	}

}
