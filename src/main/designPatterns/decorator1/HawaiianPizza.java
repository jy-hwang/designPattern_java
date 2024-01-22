package main.designPatterns.decorator1;

import java.util.Arrays;

public class HawaiianPizza extends Pizza {

	public HawaiianPizza() {
		toppings = Arrays.asList("Tomato sauce", "Pineapple", "Bacon", "Cheese");
	}

	@Override
	public int getPrice() {
		return 9500;
	}

}
