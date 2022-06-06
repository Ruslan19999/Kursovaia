package Strategy;



public class Contextt {

Strategy strategy;

	
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}



	public void Pay(double amount)
    {
        strategy.pay(amount);
    }

}
