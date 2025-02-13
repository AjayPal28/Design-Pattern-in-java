package com.ajay.SingletonDesignPattern;

public class Main {
	public static void main(String[] args) {
		Logger logger = Logger.getInstance();

		new Thread(() -> {
			logger.info("ajay");
		}).start();
		
		new Thread(() -> {
			logger.info("sonu");
		}).start();
	}
}
