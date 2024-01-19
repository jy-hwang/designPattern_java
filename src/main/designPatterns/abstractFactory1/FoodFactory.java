package main.designPatterns.abstractFactory1;

import java.util.List;

public interface FoodFactory {

	String createDough();
	
	String createSauce();
	
	String createCheese();
	
	String createVeggies();
	
	List<String> createToppings();
	
}
