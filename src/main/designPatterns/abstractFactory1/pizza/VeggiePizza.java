package main.designPatterns.abstractFactory1.pizza;

import main.designPatterns.abstractFactory1.FoodFactory;
import main.designPatterns.abstractFactory1.Pizza;

public class VeggiePizza extends Pizza {
	FoodFactory factory;

	public VeggiePizza(FoodFactory factory) {
		this.factory = factory;
	}

	@Override
	public void prepare() {
		dough = factory.createDough();
		sauce = factory.createSauce();
		veggies = factory.createVeggies();
		toppings.addAll(factory.createToppings());
	}

}
