package main.designPatterns.strategy1.walking;

public class Quadrupedalism implements Walkable {

	@Override
	public int step() {
		System.out.println("Using 4 leg to walk");
		return 4;
	}

}
