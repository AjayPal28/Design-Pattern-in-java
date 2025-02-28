package com.ajay.FacadeDesignPattern;

public class Main {
	public static void main(String[] args) {
		HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade(new Amplifer(),new DvdPlayer(),new Projector());
		homeTheaterFacade.watchMovie("Madaara", 100);
	}
}
