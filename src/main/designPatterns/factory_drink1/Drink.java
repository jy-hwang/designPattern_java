package main.designPatterns.factory_drink1;

public interface Drink {
  void prepare();

  void serve();

  String getName();

  int getPrice();
}
