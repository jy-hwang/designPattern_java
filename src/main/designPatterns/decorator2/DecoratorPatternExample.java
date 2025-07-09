package main.designPatterns.decorator2;

public class DecoratorPatternExample {
  public static void main(String[] args) {
    Coffee simpleCoffee = new SimpleCoffee();
    System.out.println(
        "Cost : " + simpleCoffee.getCost() + ", Description : " + simpleCoffee.getDescription());

    Coffee twoShotCoffee = new EspressoDecorator(simpleCoffee);
    System.out.println(
        "Cost : " + twoShotCoffee.getCost() + ", Description : " + twoShotCoffee.getDescription());


    Coffee milkCoffee = new MilkDecorator(simpleCoffee);
    System.out.println(
        "Cost : " + milkCoffee.getCost() + ", Description : " + milkCoffee.getDescription());

    Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
    System.out.println("Cost : " + sugarMilkCoffee.getCost() + ", Description : "
        + sugarMilkCoffee.getDescription());

  }
}
