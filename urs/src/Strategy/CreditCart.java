package Strategy;


public class CreditCart implements Strategy{

	private String name;
	private long cardNumber;
	
	public CreditCart(String name, long i) {
		this.name = name;
		this.cardNumber = i;
	}



	@Override
	public void pay(double amount) {
		
		System.out.println("Имя: " + name);
		System.out.println("Номер карты: " + cardNumber );
		System.out.println("Сумма: " + amount  );

	}

}
