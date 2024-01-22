package main.designPatterns.decorator1;

import java.util.Arrays;

public class DetroitPizza extends Pizza {

	public DetroitPizza() {
		toppings = Arrays.asList("Tomato sauce", "Pepperoni", "Mozzarella cheese", "Chddar cheese");
		dough.setShape(Dough.Shape.RECTANGLE);

	}

	@Override
	public int getPrice() {
		return 10500;
	}
}
