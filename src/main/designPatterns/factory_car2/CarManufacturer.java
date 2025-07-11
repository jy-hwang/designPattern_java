package main.designPatterns.factory_car2;

import java.util.List;

public class CarManufacturer {
  private String companyName;
  private int totalProduced = 0;

  public CarManufacturer(String companyName) {
    this.companyName = companyName;
  }

  public Car produceCar(String type) {
    System.out.println("\n🏭 " + companyName + " 자동차 제조 시작");
    System.out.println("주문 타입: " + type);

    Car car = CarFactory.createCar(type);
    car.manufacture();

    totalProduced++;
    System.out.println("📊 현재까지 총 " + totalProduced + "대 생산");

    return car;
  }

  public Car produceCustomCar(String type, String color, List<String> features) {
    System.out.println("\n🎨 " + companyName + " 맞춤형 자동차 제조");
    System.out.println("주문 타입: " + type + " (색상: " + color + ")");

    Car car = CarFactory.createCustomCar(type, color, features);
    car.manufacture();

    totalProduced++;
    return car;
  }
}
