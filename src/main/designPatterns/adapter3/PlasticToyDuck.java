package main.designPatterns.adapter3;

public class PlasticToyDuck implements ToyDuck {
	@Override
	public void squeak() {
		System.out.println("Squeak");
	}

}
