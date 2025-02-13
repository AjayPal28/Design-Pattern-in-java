package com.ajay.AbstractFactoryDesignPattern;

public class Main {
	private Button button;
	private Checkbox checkbox;

	public Main(GuiFactory guiFactory) {
		this.button=guiFactory.button();
		this.checkbox=guiFactory.checkbox();
	}
	
	public void paint() {
		button.paint();
		checkbox.paint();
	}
	
	
	public static void main(String[] args) {
		GuiFactory factory;
		String os="window";
		
		if(os.equalsIgnoreCase("window"))
			factory= new WindowFactory();
		else{
			factory=new MacFactory();
		}
		
		new Main(factory).paint();
	}
	
}
