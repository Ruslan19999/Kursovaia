package Builder;

public class BigHappyMealBuilder extends HappyMealBuilder{
	
	private HappyMeal happy_meal = new HappyMeal();

	public  void BuildBurger(){
		
	happy_meal.Add("BigMac");
	}

	public  void BuildPepsi(){

	happy_meal.Add("Pepsi 0.7");
	}

	public  void BuildToy(){

	happy_meal.Add("Two toys");
	}

	public  HappyMeal GetProduct(){

	return happy_meal;
	}
	
}
