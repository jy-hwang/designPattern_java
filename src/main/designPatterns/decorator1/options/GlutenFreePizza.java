package main.designPatterns.decorator1.options;

import java.util.List;
import java.util.Set;

import main.designPatterns.decorator1.Pizza;
import main.designPatterns.decorator1.PizzaTopper;

public class GlutenFreePizza extends PizzaTopper {

	private static final int GLUTEN_FREE_PRICE = 3500;

	public GlutenFreePizza(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public int getPrice() {
		return pizza.getPrice() + GLUTEN_FREE_PRICE;
	}

	@Override
	public List<String> getToppings() {
		return pizza.getToppings();
	}

}
