package com.ajay.SingletonDesignPattern;

import java.time.LocalDateTime;

public class Logger {

	private static volatile Logger logger = null;

	private Logger() {
		super();
	}

	public static Logger getInstance() {

		if (logger == null) {

			synchronized (Logger.class) {

				if (logger == null) {
					logger = new Logger();
				}

			}
		}
		return logger;

	}

	public void info(String args) {
		System.out.println(LocalDateTime.now()+" : "+args);
	}
}


