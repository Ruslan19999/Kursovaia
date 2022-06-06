package Builder;

import java.util.ArrayList;
import java.util.List;

public class HappyMeal {
	
public static List<String> parts = new ArrayList<>();

	
	public void Add(String part)
	{
	parts.add(part);
	}

	public void Show()
	{
	System.out.println(" Happy Meal Parts ——-");

	for (String part : parts) {
		System.out.println(part);
	}
	}
}

