package main.designPatterns.factoryMethod1;

import main.designPatterns.BaseUnitTest;

public class FactoryMethodTest extends BaseUnitTest {

	public static void main(String[] args) {
		FactoryMethodTest fmt1 = new FactoryMethodTest();
		fmt1.testOrderPizza();
	}

	public void testOrderPizza() {
		PizzaStore storeAtNewYork = new NewYorkPizzaStore();
		PizzaStore storeAtChicago = new ChicagoPizzaStore();

		println("# Order NY Style cheese pizza");
		// pizza is created internally by store `storeAtNewYork`
		Pizza pizza1 = storeAtNewYork.orderPizza("cheese");
		println("got pizza: " + pizza1);

		println("# Order NY Style pepperoni pizza");
		Pizza pizza2 = storeAtNewYork.orderPizza("pepperoni");
		println("got pizza: " + pizza2);

		println("# Order Chicago Style cheese pizza");
		Pizza pizza3 = storeAtChicago.orderPizza("cheese");
		println("got pizza: " + pizza3);

		println("# Order Chicago Style pepperoni pizza");
		Pizza pizza4 = storeAtChicago.orderPizza("pepperoni");
		println("got pizza: " + pizza4);
	}

}
