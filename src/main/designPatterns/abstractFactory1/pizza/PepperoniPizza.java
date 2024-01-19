package main.designPatterns.abstractFactory1.pizza;

import main.designPatterns.abstractFactory1.FoodFactory;
import main.designPatterns.abstractFactory1.Pizza;

public class PepperoniPizza extends Pizza {
	FoodFactory factory;

	public PepperoniPizza(FoodFactory factory) {
		this.factory = factory;
	}

	@Override
	public void prepare() {
		dough = factory.createDough();
		sauce = factory.createDough();
		cheese = factory.createDough();
		toppings.addAll(factory.createToppings());
	}
	
}
