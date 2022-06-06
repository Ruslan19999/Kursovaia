package Builder;

public class SmallHappyMealBuilder extends HappyMealBuilder{

	private HappyMeal happy_meal = new HappyMeal();

	
	public  void BuildBurger(){

	happy_meal.Add("Hamburger");

	}

	public  void BuildPepsi(){

	happy_meal.Add("Pepsi 0.3");

	}

	public  void BuildToy(){

	happy_meal.Add("One toy");

	}
	
	

	public  HappyMeal GetProduct(){

	return happy_meal;
}


}
