package main.designPatterns.strategy1;

import main.designPatterns.strategy1.flying.FlyWithWings;
import main.designPatterns.strategy1.walking.Bipedalism;

public class Bird extends Animal{

	public Bird() {
		howToWalk = new Bipedalism();
		howToFly = new FlyWithWings();
	}
	
}
