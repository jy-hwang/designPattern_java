package main.designPatterns.strategy1.walking;

public class NotMovable implements Walkable {

	@Override
	public int step() {
		System.out.println("Can't move");
		return 0;
	}
	
}
