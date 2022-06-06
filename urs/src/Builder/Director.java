package Builder;

public class Director {
	// Конструирование объекта по частям
		public void Construct(HappyMealBuilder builder)
		{
		builder.BuildBurger();
		builder.BuildPepsi();
		builder.BuildToy();
		
		}
	}	
