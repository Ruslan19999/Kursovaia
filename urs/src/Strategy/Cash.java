package Strategy;


public class Cash implements Strategy{

	@Override
	public void pay(double amount) {

		System.out.println("Сумма" + amount);

		
	}
}
