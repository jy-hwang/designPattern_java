package main.designPatterns.decorator1;

import main.designPatterns.BaseUnitTest;
import main.designPatterns.decorator1.options.GlutenFreePizza;
import main.designPatterns.decorator1.options.HotSaucePizza;
import main.designPatterns.decorator1.options.VeganPizza;

public class DecorationPizzaTest extends BaseUnitTest {

	public static void main(String[] args) {
		DecorationPizzaTest dpt1 = new DecorationPizzaTest();
		//dpt1.testDecorateTopping();
		dpt1.testDecorateDough();
	}

	public void testDecorateTopping() {
		System.out.print("# Create new HawaiianPizza");
		Pizza pizza = new HawaiianPizza();

		System.out.print(toString(pizza));

		println("Add HotSauced option");
        HotSaucePizza hotSaucedPizza = new HotSaucePizza(pizza);
        println(toString(hotSaucedPizza));

        println("Add HotSauced option");
        HotSaucePizza superHotPizza = new HotSaucePizza(hotSaucedPizza);
        println(toString(superHotPizza));

        println("Add ForVegan option");
        VeganPizza superHotVeganPizza = new VeganPizza(superHotPizza);
        println(toString(superHotVeganPizza));

	}
	
	
	public void testDecorateDough() {
        println("# Create new DetroitPizza");
        Pizza pizza2 = new DetroitPizza();
        println(toString(pizza2));

        println("Add GlutenFree option");
        GlutenFreePizza glutenFreePizza2 = new GlutenFreePizza(pizza2);
        println(toString(glutenFreePizza2));
	}
	private static String toString(Pizza pizza) {
		return pizza + ", price=" + pizza.getPrice() + "\n";
	}
}
