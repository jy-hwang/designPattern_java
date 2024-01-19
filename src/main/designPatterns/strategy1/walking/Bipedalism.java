package main.designPatterns.strategy1.walking;

public class Bipedalism implements Walkable{

	@Override
	public int step() {
		System.out.println("Using 2 leg to walk");
		return 2;
	}
	
}
