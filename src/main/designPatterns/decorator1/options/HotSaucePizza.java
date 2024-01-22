package main.designPatterns.decorator1.options;

import java.util.List;
import java.util.Set;

import main.designPatterns.decorator1.Pizza;
import main.designPatterns.decorator1.PizzaTopper;

public class HotSaucePizza extends PizzaTopper {

	private static final int HOT_SAUCE_PRICE = 500;

	public HotSaucePizza(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public int getPrice() {
		return pizza.getPrice() + HOT_SAUCE_PRICE;
	}

	@Override
	public List<String> getToppings() {
		List<String> toppings = pizza.getToppings();
		toppings.add("Hot sauce");
		return toppings;
	}
}
