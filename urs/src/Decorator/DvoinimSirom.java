package Decorator;

public class DvoinimSirom extends Decorator{

	Pizza pizza;
	
	public DvoinimSirom(Pizza p) {
		this.pizza = p;
	}
	
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return pizza.getInfo() + " с двойным сыром";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice() + 30;
	}
}
