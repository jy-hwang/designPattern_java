package main.designPatterns.strategy1;

import main.designPatterns.strategy1.walking.Bipedalism;

public class Human extends Animal{

	public Human() {
		howToWalk = new Bipedalism();
	}
	
}
