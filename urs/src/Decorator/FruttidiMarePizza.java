package Decorator;

public class FruttidiMarePizza extends Decorator{

	Pizza pizza;
	
	public FruttidiMarePizza(Pizza p) {
		this.pizza = p;
	}
	
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return pizza.getInfo() + " с морепродуктами";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice() + 30;
	}

}
