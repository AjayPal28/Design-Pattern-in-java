package com.ajay.AbstractFactoryDesignPattern;

public class MacFactory implements GuiFactory{

	@Override
	public Button button() {
		return new MacButton();
	}

	@Override
	public Checkbox checkbox() {
		return new MacCheckBox();
	}

}
