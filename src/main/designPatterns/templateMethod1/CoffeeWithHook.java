package main.designPatterns.templateMethod1;

public class CoffeeWithHook extends CoffeeTemplate {

  @Override
  void brewCoffeeGrounds() {
    System.out.println("Brewing coffee grounds");
  }

  @Override
  void addCondiments() {
    System.out.println("Add sugar and milk");
  }



}
