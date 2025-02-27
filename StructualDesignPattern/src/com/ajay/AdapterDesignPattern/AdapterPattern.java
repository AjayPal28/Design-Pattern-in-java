package com.ajay.AdapterDesignPattern;

public class AdapterPattern {
	public static void main(String[] args) {
		AudioPlayer audioPlayer=new AudioPlayer();
		audioPlayer.play("mp4", "Hanuman Chalisa");
	}
}
