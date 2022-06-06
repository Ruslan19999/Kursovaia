package Builder;

public abstract class HappyMealBuilder {
	
	public abstract void BuildBurger();
	public abstract void BuildPepsi();
	public abstract void BuildToy();
	
	public abstract HappyMeal GetProduct();
}
