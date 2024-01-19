package main.designPatterns.factoryMethod1;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		return switch (type) {
		case "cheese" -> new ChicagoCheesePizza();
		case "pepperoni" -> new ChicagoPepperoniPizza();
		default -> null;
		};
	}

}

class ChicagoCheesePizza extends ChicagoStylePizza {
	ChicagoCheesePizza() {
		super();
		name = "Chicago Style Cheese Pizza";
	}

}

class ChicagoPepperoniPizza extends ChicagoCheesePizza {
	ChicagoPepperoniPizza() {
		super();
		name = "Chicago Style Pepperoni Pizza";
		toppings.add("Pepperoni");
	}

}
