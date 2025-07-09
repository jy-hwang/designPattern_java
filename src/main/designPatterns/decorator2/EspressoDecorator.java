package main.designPatterns.decorator2;

public class EspressoDecorator extends CoffeeDecorator {
  public EspressoDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Extra Espresso Shot";
  }

  @Override
  public double getCost() {
    return super.getCost() + 0.7;
  }

}
