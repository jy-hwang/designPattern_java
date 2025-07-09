package main.designPatterns.templateMethod1;

public class TemplateMethodPatternExample {
  public static void main(String[] args) {

    CoffeeTemplate coffee = new CoffeeWithHook();
    coffee.makeCoffee();
  }
}
