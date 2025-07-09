package main.designPatterns.decorator3;

public class MochaCoffee extends Decorator {

  public MochaCoffee(Coffee coffee) {
    super(coffee);
  }

  @Override
  public void brewing() {
    super.brewing();
    System.out.print("Adding Mocha Syrup ");
  }


}
