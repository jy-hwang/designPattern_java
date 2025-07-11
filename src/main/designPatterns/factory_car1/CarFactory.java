package main.designPatterns.factory_car1;

public abstract class CarFactory {
  public abstract Car createCar(String name);

  public abstract Car returnCar(String name);

  public void numbering() {
    System.out.println("numbering");
  }

  public void washCar() {
    System.out.println("wash car");
  }

  final public void sellCar(String name) {
    createCar(name);

    numbering();

    washCar();
  }
}
