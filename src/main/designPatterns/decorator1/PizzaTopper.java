package main.designPatterns.decorator1;

import java.util.List;

public abstract class PizzaTopper extends Pizza {

	protected Pizza pizza;

	@Override
	public abstract List<String> getToppings();

	@Override
	public Dough getDough() {
		return new Dough(pizza.getDough());
	}

}
