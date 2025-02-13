package com.ajay.AbstractFactoryDesignPattern;

public class WindowFactory implements GuiFactory{

	@Override
	public Button button() {
		return new WindowButton();
	}

	@Override
	public Checkbox checkbox() {
		
		return new WindowCheckBox();
	}

}
