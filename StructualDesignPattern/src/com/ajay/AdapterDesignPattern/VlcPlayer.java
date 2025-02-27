package com.ajay.AdapterDesignPattern;

public class VlcPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc File : "+fileName);

	}

	@Override
	public void playMp4(String fileName) {}

}
