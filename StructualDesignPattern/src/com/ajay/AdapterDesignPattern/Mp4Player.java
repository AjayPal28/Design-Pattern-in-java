package com.ajay.AdapterDesignPattern;

public class Mp4Player implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing Mp4 File : " + fileName);
	}
}
