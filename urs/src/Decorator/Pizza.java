package Decorator;

public abstract class Pizza {

	String name;
	
	public String getInfo() {
		return name;
	}
	public abstract int getPrice();
}
