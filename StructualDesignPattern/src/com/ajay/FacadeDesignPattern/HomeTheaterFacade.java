package com.ajay.FacadeDesignPattern;

public class HomeTheaterFacade {
	private Amplifer amplifer;
	private DvdPlayer dvdPlayer;
	private Projector projector;

	
	
	
	public HomeTheaterFacade(Amplifer amplifer, DvdPlayer dvdPlayer, Projector projector) {
		super();
		this.amplifer = amplifer;
		this.dvdPlayer = dvdPlayer;
		this.projector = projector;
	}

	public void watchMovie(String movie, int volume) {
		amplifer.on();
		amplifer.setVolume(volume);
		dvdPlayer.on();
		dvdPlayer.play(movie);
		projector.on();
		projector.wideScreen();
		
	}
}
