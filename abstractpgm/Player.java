package com.obsqura.abstractpgm;

public interface Player {
	void play();
	void pause();
	void stop();
	

}
interface Recorder
{
	void record();
	
	
	
}
class VLCMediaPlayer implements Player
{

	@Override
	public void play() {
		System.out.println("VLC player is playing song");
	}

	@Override
	public void pause() {
		
		System.out.println("VLC player is paused");
	}

	@Override
	public void stop() {
		
		System.out.println("VLC player is stopped");
	}
	
}


class TapeRecord implements Player,Recorder
{

	@Override
	public void play() {
		System.out.println("Tape Recorder is playing song");
	}

	@Override
	public void pause() {
		
		System.out.println("Tape Recorder is paused");
	}

	@Override
	public void stop() {
		
		System.out.println("Tape Recorder is stopped");
	}
	public void record()
	{
		System.out.println("Tape Recorder is recording");	
		
	}
}