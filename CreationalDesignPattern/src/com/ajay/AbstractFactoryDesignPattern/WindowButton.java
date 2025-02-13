package com.ajay.AbstractFactoryDesignPattern;

public class WindowButton implements Button {

	@Override
	public void paint() {
		System.out.println("Window Button");
	}

}
