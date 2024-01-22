package main.designPatterns.abstractFactory1;

import main.designPatterns.BaseUnitTest;

public class AbstractFactoryTest extends BaseUnitTest {

	public static void main(String[] args) {
		AbstractFactoryTest aft1 = new AbstractFactoryTest();

		aft1.testOrderPizza();
	}

	public void testOrderPizza() {
		PizzaStore storeAtNewYork = new NewYorkPizzaStore();
		PizzaStore storeAtChicago = new ChicagoPizzaStore();

		println("# Order NY Style cheese pizza");
		Pizza pizzaCheeseNY = storeAtNewYork.orderPizza("cheese");
		println("got pizza: " + pizzaCheeseNY);

		println("# Order Chicago Style cheese pizza");
		Pizza pizzaCheeseCH = storeAtChicago.orderPizza("cheese");
		println("got pizza: " + pizzaCheeseCH);

		println("# Order NY Style pepperoni pizza");
		Pizza pizzaPepperoniNY = storeAtNewYork.orderPizza("pepperoni");
		println("got pizza: " + pizzaPepperoniNY);

		println("# Order Chicago Style pepperoni pizza");
		Pizza pizzaPepperoniCH = storeAtChicago.orderPizza("pepperoni");
		println("got pizza: " + pizzaPepperoniCH);

		println("# Order NY Style veggie pizza");
		Pizza pizzaVeggieNY = storeAtNewYork.orderPizza("veggies");
		println("got pizza: " + pizzaVeggieNY);

		println("# Order Chicago Style veggie pizza");
		Pizza pizzaVeggieCH = storeAtChicago.orderPizza("veggies");
		println("got pizza: " + pizzaVeggieCH);
	}

}
