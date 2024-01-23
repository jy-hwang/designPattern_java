package main.designPatterns.adapter3;

public class BirdTest {

	public static void main(String[] args) {

		Sparrow sparrow1 = new Sparrow();
		PlasticToyDuck toyDuck = new PlasticToyDuck();
		
		BirdAdapter birdAdapter = new BirdAdapter(sparrow1);
		
		System.out.println("Sparrow...");
		sparrow1.fly();
		sparrow1.makeSound();
		
		System.out.println("ToyDuck...");
		toyDuck.squeak();
		

		System.out.println("BirdAdapter...");
		birdAdapter.squeak();
		
		
		
	}

}
