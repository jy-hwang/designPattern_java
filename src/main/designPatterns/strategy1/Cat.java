package main.designPatterns.strategy1;

import main.designPatterns.strategy1.walking.Quadrupedalism;

public class Cat extends Animal{

	public Cat() {
		howToWalk = new Quadrupedalism();
	}
	
}
