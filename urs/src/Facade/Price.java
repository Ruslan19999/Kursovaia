package Facade;

import urs.Order;

public class Price {

	Order order = new Order();
	int suma;
	
	public int pr() {
		
		
		order.print();

		
		
		for(int i = 0; i < order.sizePrice(); i++) {
			int a = order.poZnaceniu(i);
			suma = suma + a;
		}
		return suma;
	}
}
