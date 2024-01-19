package main.designPatterns.factoryMethod1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Pizza {

	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<>();

	public void cook() {
			sauce += " (grilled)";
		System.out.println("Cook : " + this);
	}

	public void cut() {
		if (dough != null) {
			dough += " (sliced)";
		}
		System.out.println("Cut : " + this);
	}

	@Override
	public String toString() {
		//@formatter:off
		return String.format("Pizza {name = %s, dough = %s, sauce = %, toppings = %s}",
				name, dough, sauce, Arrays.toString(toppings.toArray()));
		//@formatter:on
	}

}
