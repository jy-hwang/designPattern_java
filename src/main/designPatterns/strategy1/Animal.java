package main.designPatterns.strategy1;

import main.designPatterns.strategy1.flying.FlyNoway;
import main.designPatterns.strategy1.flying.Flyable;
import main.designPatterns.strategy1.walking.NotMovable;
import main.designPatterns.strategy1.walking.Walkable;

public class Animal {

	Walkable howToWalk;
	Flyable howToFly;

	public Animal() {
		// default
		howToWalk = new NotMovable();
		howToFly = new FlyNoway();
	}

	public void setWalkingType(Walkable howToWalk) {
		this.howToWalk = howToWalk;
	}

	public void setFlying(Flyable howToFly) {
		this.howToFly = howToFly;
	}


	/**
	 * @return Integer is how many footprints after walking
	 */
	public int walk() {
		return howToWalk.step();
	}

	
	/**
	 * @return String is what it sounds
	 */
	public String fly() {
		return howToFly.fly();
	}
	
}
