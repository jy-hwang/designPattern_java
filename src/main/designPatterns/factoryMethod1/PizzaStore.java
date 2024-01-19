package main.designPatterns.factoryMethod1;

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.cook();
		pizza.cut();
		return pizza;
	}

	protected abstract Pizza createPizza(String type);

}
