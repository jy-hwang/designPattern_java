package main.designPatterns.strategy1;

import main.designPatterns.strategy1.walking.Quadrupedalism;

public class Dog extends Animal{

	public Dog() {
		howToWalk = new Quadrupedalism();
	}
	
}
