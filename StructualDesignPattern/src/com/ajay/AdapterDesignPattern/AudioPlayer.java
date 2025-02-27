package com.ajay.AdapterDesignPattern;

public class AudioPlayer implements MediaPlayer {

	private MediaAdapter mediaAdapter = null;

	@Override
	public void play(String audioType, String fileName) {

		if (audioType.equalsIgnoreCase("mp3"))
			System.out.println("Playing mp3 file : " + fileName);
		else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}else
			System.out.println("Invalid Media Type : "+audioType);
	}

}
